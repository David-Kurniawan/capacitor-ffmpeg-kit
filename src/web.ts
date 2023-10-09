import { WebPlugin } from '@capacitor/core';

import type {
  FfmpegkitPlugin,
  ExecOptions
} from './definitions';

export class FfmpegkitWeb extends WebPlugin implements FfmpegkitPlugin {
  async exec(options: ExecOptions): Promise<void> {
    console.log('exec', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async stop(): Promise<void> {
    console.log('stop');
    throw this.unimplemented('Not implemented on web.');
  }
}
