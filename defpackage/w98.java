package defpackage;

import ru.ok.tamtam.android.calls.MediaProjectionService;

/* renamed from: w98  reason: default package */
public final /* synthetic */ class w98 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaProjectionService b;

    public /* synthetic */ w98(MediaProjectionService mediaProjectionService, int i) {
        this.a = i;
        this.b = mediaProjectionService;
    }

    public final Object invoke() {
        MediaProjectionService mediaProjectionService = this.b;
        switch (this.a) {
            case 0:
                int i = MediaProjectionService.X;
                return pfa.x(mediaProjectionService).h();
            default:
                int i2 = MediaProjectionService.X;
                return pfa.x(mediaProjectionService).l();
        }
    }
}
