export interface FfmpegkitPlugin {
  exec(options: ExecOptions): Promise<void>;
  stop(): Promise<void>;
}

export interface ExecOptions {
  /**
   * Ffmpeg command
   */
  command: string;

  /**
   * Channel name
   */
  name: string;
}
