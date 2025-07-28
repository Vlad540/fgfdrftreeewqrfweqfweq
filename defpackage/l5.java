package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.messages.views.widgets.AvatarCropView;

/* renamed from: l5  reason: default package */
public final /* synthetic */ class l5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAvatarCrop b;

    public /* synthetic */ l5(ActAvatarCrop actAvatarCrop, int i) {
        this.a = i;
        this.b = actAvatarCrop;
    }

    public final void onClick(View view) {
        ActAvatarCrop actAvatarCrop = this.b;
        switch (this.a) {
            case 0:
                kw3 kw3 = (kw3) actAvatarCrop.Y0.getZoomableController();
                if (!kw3.d) {
                    float f = kw3.p;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{90.0f});
                    ofFloat.setDuration(250);
                    ofFloat.addUpdateListener(new gfc(kw3, f, 2));
                    ofFloat.addListener(kw3);
                    ofFloat.start();
                    actAvatarCrop.g1 = !actAvatarCrop.g1;
                    Matrix matrix = actAvatarCrop.f1;
                    Point point = actAvatarCrop.e1;
                    matrix.postRotate(90.0f, ((float) point.x) / 2.0f, ((float) point.y) / 2.0f);
                    return;
                }
                return;
            case 1:
                kw3 kw32 = (kw3) actAvatarCrop.Y0.getZoomableController();
                if (!kw32.d) {
                    float v = e07.v(kw32.k, 0);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{v, -v});
                    ofFloat2.setDuration(250);
                    ofFloat2.addUpdateListener(new c00(6, kw32));
                    ofFloat2.addListener(kw32);
                    ofFloat2.start();
                    Matrix matrix2 = actAvatarCrop.f1;
                    Point point2 = actAvatarCrop.e1;
                    matrix2.postScale(-1.0f, 1.0f, ((float) point2.x) / 2.0f, ((float) point2.y) / 2.0f);
                    return;
                }
                return;
            case 2:
                int i = ActAvatarCrop.h1;
                actAvatarCrop.finish();
                return;
            case 3:
                actAvatarCrop.g1 = false;
                AvatarCropView avatarCropView = actAvatarCrop.Y0;
                kw3 kw33 = (kw3) avatarCropView.getZoomableController();
                kw33.reset();
                kw33.e();
                if (avatarCropView.S0 > 0 && avatarCropView.T0 == 0) {
                    ((kw3) avatarCropView.getZoomableController()).d(avatarCropView.S0);
                }
                avatarCropView.f(kw33.k);
                actAvatarCrop.f1.reset();
                actAvatarCrop.c1.setVisibility(8);
                return;
            default:
                int i2 = ActAvatarCrop.h1;
                ((k93) actAvatarCrop.O0.b).getClass();
                nqc nqc = nqc.a;
                mv9 mv9 = new mv9(2, new m5(0, actAvatarCrop));
                mbe t = nqc.t();
                t.getClass();
                mv9.m(((nbe) t).a()).i(((nbe) nqc.t()).b()).k(new pn1(new n5(actAvatarCrop, 0), 2, new n5(actAvatarCrop, 1)));
                return;
        }
    }
}
