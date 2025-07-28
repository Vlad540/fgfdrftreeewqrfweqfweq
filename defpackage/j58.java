package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: j58  reason: default package */
public final class j58 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j58(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((x46) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j58 j58 = new j58(this.Y, continuation);
        j58.X = obj;
        return j58;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        x46 x46 = (x46) this.X;
        boolean z = x46 instanceof u46;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        if (z) {
            k77[] k77Arr = MediaGalleryWidget.Z;
            mediaGalleryWidget.l0().x0(0);
            m66.r(mediaGalleryWidget.n0(), true, 2);
        } else if (x46 instanceof w46) {
            k77[] k77Arr2 = MediaGalleryWidget.Z;
            m66 n0 = mediaGalleryWidget.n0();
            qwc qwc = ((w46) x46).a;
            n0.getClass();
            n0.u(qwc.a, true);
        } else if (x46 instanceof v46) {
            k77[] k77Arr3 = MediaGalleryWidget.Z;
            m66 n02 = mediaGalleryWidget.n0();
            o46 o46 = ((v46) x46).a;
            n02.getClass();
            udd.q("m66", "selectAlbum " + o46);
            ((bd) n02.N0.getValue()).f("MEDIA_SEND_ALBUM_CHANGED");
            grd grd = n02.F0;
            o46 o462 = (o46) grd.getValue();
            if (!hhd.f(o462, o46)) {
                try {
                    g37 g37 = n02.L0;
                    if (g37 != null) {
                        g37.cancel((CancellationException) null);
                    }
                    qod qod = n02.M0;
                    if (qod != null) {
                        qod.cancel((CancellationException) null);
                    }
                } catch (Throwable unused) {
                }
                n02.D0.m((Object) null, Boolean.FALSE);
                grd.m((Object) null, o46);
                n02.A0.m((Object) null, hw4.a);
                n02.M0 = taf.n(n02, n02.o, (ru3) null, new h66(o462, n02, o46, (Continuation) null), 2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
