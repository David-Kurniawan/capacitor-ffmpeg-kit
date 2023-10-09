export interface FfmpegkitPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
