# capacitor-ffmpeg-kit

FFMPEG for capacitor

## Install

```bash
npm install capacitor-ffmpeg-kit
npx cap sync
```

## API

<docgen-index>

* [`exec(...)`](#exec)
* [`stop()`](#stop)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### exec(...)

```typescript
exec(options: ExecOptions) => Promise<void>
```

| Param         | Type                                                |
| ------------- | --------------------------------------------------- |
| **`options`** | <code><a href="#execoptions">ExecOptions</a></code> |

--------------------


### stop()

```typescript
stop() => Promise<void>
```

--------------------


### Interfaces


#### ExecOptions

| Prop          | Type                | Description    |
| ------------- | ------------------- | -------------- |
| **`command`** | <code>string</code> | Ffmpeg command |
| **`name`**    | <code>string</code> | Channel name   |

</docgen-api>
