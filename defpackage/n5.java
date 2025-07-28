package defpackage;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: n5  reason: default package */
public final /* synthetic */ class n5 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAvatarCrop b;

    public /* synthetic */ n5(ActAvatarCrop actAvatarCrop, int i) {
        this.a = i;
        this.b = actAvatarCrop;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, r5, java.lang.Object, android.app.Activity, ru.ok.messages.views.ActAvatarCrop] */
    public final void accept(Object obj) {
        ? r1 = this.b;
        switch (this.a) {
            case 0:
                Rect rect = (Rect) obj;
                int i = ActAvatarCrop.h1;
                r1.getClass();
                Intent intent = new Intent();
                intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                Point point = r1.e1;
                float f = (float) point.x;
                float f2 = (float) point.y;
                intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(((float) rect.left) / f, ((float) rect.top) / f2, ((float) rect.right) / f, ((float) rect.bottom) / f2));
                intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) r1.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", r1.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                r1.setResult(-1, intent);
                r1.finish();
                if (r1.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                    r1.overridePendingTransition(0, 0);
                    return;
                }
                return;
            default:
                int i2 = ActAvatarCrop.h1;
                r1.getClass();
                udd.n("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                r1.setResult(0);
                int i3 = cic.D;
                Handler handler = a06.h;
                a06.H(1, r1, r1.getString(i3));
                r1.finish();
                return;
        }
    }
}
