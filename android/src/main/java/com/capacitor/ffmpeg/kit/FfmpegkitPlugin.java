package com.capacitor.ffmpeg.kit;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.LogCallback;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;


import android.util.Log;

@CapacitorPlugin(name = "Ffmpegkit")
public class FfmpegkitPlugin extends Plugin {

    @PluginMethod
    public void exec(PluginCall call) {
        String command = call.getString("command");
        String name = call.getString("name");

        FFmpegKit.executeAsync(command, new FFmpegSessionCompleteCallback() {

          @Override
          public void apply(FFmpegSession session) {

          }
        }, new LogCallback() {

          @Override
          public void apply(com.arthenica.ffmpegkit.Log log) {

          }
        }, new StatisticsCallback() {

          @Override
          public void apply(Statistics statistics) {
            JSObject ret = new JSObject();
            ret.put("name", name);
            ret.put("sessionId", statistics.getSessionId());
            ret.put("info", statistics.getVideoFps());
            notifyListeners("stream", ret);
          }
        });
    }

    @PluginMethod
    public void stop(PluginCall call) {
        FFmpegKit.cancel();
        FFmpegKitConfig.clearSessions();
        call.resolve();
    }
}
