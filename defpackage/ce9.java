package defpackage;

import android.content.Intent;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: ce9  reason: default package */
public final /* synthetic */ class ce9 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ de9 b;

    public /* synthetic */ ce9(de9 de9, int i) {
        this.a = i;
        this.b = de9;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [r5, android.app.Activity] */
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                de9 de9 = this.b;
                long e = ((al7) de9.Y).e();
                de9.y0 = e;
                if (e > de9.x0) {
                    de9.a2();
                    return;
                } else {
                    ((jf9) ((ge9) de9.b)).C0.setPointerPosition(e);
                    return;
                }
            default:
                de9 de92 = this.b;
                long j = de92.w0;
                long j2 = de92.x0;
                FrgTrimVideo frgTrimVideo = de92.c;
                frgTrimVideo.getClass();
                Intent intent = new Intent();
                intent.putExtra("ru.ok.tamtam.extra.START_POSITION", j);
                intent.putExtra("ru.ok.tamtam.extra.END_POSITION", j2);
                intent.putExtra("ru.ok.tamtam.extra.THUMBNAIL_URI", (String) obj);
                frgTrimVideo.h1().setResult(-1, intent);
                frgTrimVideo.s1();
                frgTrimVideo.f1();
                return;
        }
    }
}
