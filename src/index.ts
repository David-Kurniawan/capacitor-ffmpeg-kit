import { registerPlugin } from '@capacitor/core';

import type { FfmpegkitPlugin } from './definitions';

const Ffmpegkit = registerPlugin<FfmpegkitPlugin>('Ffmpegkit', {
  web: () => import('./web').then(m => new m.FfmpegkitWeb()),
});

export * from './definitions';
export { Ffmpegkit };
