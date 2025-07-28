package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;

/* renamed from: e32  reason: default package */
public final class e32 extends qc2 {
    public final /* synthetic */ int J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e32(View view, int i) {
        super(view);
        this.J0 = i;
    }

    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                jh8 jh8 = (jh8) pg7;
                ua2 ua2 = (ua2) this.a;
                ua2.setId((int) jh8.a);
                ua2.setupAudio(jh8);
                return;
            case 1:
                G((oh8) pg7);
                return;
            default:
                qh8 qh8 = (qh8) pg7;
                td2 td2 = (td2) this.a;
                td2.setId((int) qh8.a);
                td2.setItem(qh8);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ua2, android.view.View] */
    public void D() {
        switch (this.J0) {
            case 0:
                ? r2 = (ua2) this.a;
                r2.removeOnAttachStateChangeListener(r2.O0);
                g37 g37 = r2.P0;
                if (g37 != null) {
                    g37.cancel((CancellationException) null);
                }
                r2.P0 = null;
                r2.Q0 = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ua2, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View, mc2] */
    public final void F(rh8 rh8, u16 u16, i26 i26) {
        switch (this.J0) {
            case 0:
                jh8 jh8 = (jh8) rh8;
                View view = this.a;
                ? r1 = (ua2) view;
                ua2 ua2 = (ua2) view;
                ua2.setId((int) jh8.a);
                ua2.setupAudio(jh8);
                a24.a0(r1, new ub((Object) u16, 9, (Object) jh8));
                r1.setOnLongClickListener(new d32(i26, jh8, this, 0));
                return;
            case 1:
                oh8 oh8 = (oh8) rh8;
                ? r0 = (mc2) this.a;
                G(oh8);
                a24.a0(r0, new ub((Object) u16, 11, (Object) oh8));
                r0.setOnLongClickListener(new d32(i26, oh8, this, 1));
                return;
            default:
                qh8 qh8 = (qh8) rh8;
                View view2 = this.a;
                td2 td2 = (td2) view2;
                td2 td22 = (td2) view2;
                td22.setId((int) qh8.a);
                td22.setItem(qh8);
                a24.a0(td2, new ub((Object) u16, 12, (Object) qh8));
                td2.setOnLongClickListener(new d32(i26, qh8, this, 2));
                return;
        }
    }

    public void G(oh8 oh8) {
        ConstraintLayout constraintLayout = (mc2) this.a;
        constraintLayout.setId((int) oh8.a);
        mz9 mz9 = constraintLayout.P0;
        String str = oh8.o;
        if (str == null || str.length() == 0) {
            mz9.setAvatarUrl((String) null);
            zd5 zd5 = (zd5) constraintLayout.O0.getValue();
            zd5.a(oh8.A0);
            mz9.h(mz9, zd5, ez9.a, 4);
        } else {
            mz9.h(mz9, constraintLayout.N0, fz9.a, 28);
            mz9.setAvatarUrl(str);
        }
        nh8 nh8 = oh8.z0;
        if (!(nh8 instanceof kh8) || !((kh8) nh8).b) {
            constraintLayout.setFileDownloadStatus(nh8);
        } else {
            ImageView imageView = constraintLayout.R0;
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(500).withStartAction(new lc2(constraintLayout, imageView, 0)).withEndAction(new lc2(imageView, constraintLayout));
        }
        constraintLayout.setTitle(oh8.X);
        CharSequence a = nh8.a().a(constraintLayout.getContext());
        constraintLayout.setFileDescription(oh8.Y + " · " + a);
    }
}
