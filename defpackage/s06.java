package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.b;
import java.io.File;
import java.util.List;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: s06  reason: default package */
public final /* synthetic */ class s06 implements uw9, of3, igb {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ s06(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [android.content.Context, ru.ok.messages.media.attaches.ActAttachesView] */
    public nsf M(View view, nsf nsf) {
        FrgAttachVideo frgAttachVideo = this.b;
        b c0 = frgAttachVideo.c0();
        int i = 0;
        if (c0 != null) {
            int a2 = dh4.a(frgAttachVideo.V0());
            if (c0 instanceof ActAttachesView) {
                ? r6 = (ActAttachesView) c0;
                View view2 = r6.b1;
                if (view2 != null) {
                    i = (view2.getMeasuredHeight() - r6.p1.getMeasuredHeight()) + dh4.a(r6);
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(nsf.b(), nsf.d(), nsf.c(), nsf.a() + i);
        se9 se9 = frgAttachVideo.Q1;
        if (se9 != null) {
            se9.A(rect);
        }
        return nsf;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                FrgAttachVideo frgAttachVideo = this.b;
                frgAttachVideo.T1 = null;
                frgAttachVideo.k1();
                swb.P(frgAttachVideo.e0(), (File) obj, ((k93) frgAttachVideo.t1.b).h());
                return;
            default:
                Throwable th = (Throwable) obj;
                FrgAttachVideo frgAttachVideo2 = this.b;
                frgAttachVideo2.T1 = null;
                frgAttachVideo2.k1();
                a06.E(frgAttachVideo2.e0(), cic.T2);
                return;
        }
    }

    public void b() {
        j8e j8e = this.b.T1;
        if (j8e != null) {
            tic.b((c97) j8e.o);
            for (oy a2 : (List) j8e.b) {
                a2.a();
            }
        }
    }
}
