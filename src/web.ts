import { WebPlugin } from '@capacitor/core';

import type { FfmpegkitPlugin } from './definitions';

export class FfmpegkitWeb extends WebPlugin implements FfmpegkitPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
