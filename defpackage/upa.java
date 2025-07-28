package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* renamed from: upa  reason: default package */
public final class upa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PhotoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public upa(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.Y = photoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((upa) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        upa upa = new upa(continuation, this.Y);
        upa.X = obj;
        return upa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        j05 j05 = (j05) this.X;
        k77[] k77Arr = PhotoViewerWidget.X;
        PhotoViewerWidget photoViewerWidget = this.Y;
        photoViewerWidget.getClass();
        if (j05 instanceof d05) {
            d05 d05 = (d05) j05;
            if (hhd.f(d05.a.x(), photoViewerWidget.l0()) && d05.a.j() == photoViewerWidget.m0()) {
                k68 y = photoViewerWidget.o0().y(photoViewerWidget.m0(), photoViewerWidget.l0());
                b68 b68 = y instanceof b68 ? (b68) y : null;
                if (b68 != null) {
                    if (photoViewerWidget.n0().getFailure()) {
                        photoViewerWidget.o0().A(photoViewerWidget.m0(), photoViewerWidget.l0());
                        photoViewerWidget.n0().r(b68.o, photoViewerWidget.n0().getFailure());
                    } else {
                        photoViewerWidget.o0().B(photoViewerWidget.m0(), photoViewerWidget.l0());
                    }
                }
            }
        } else if (j05 instanceof f05) {
            f05 f05 = (f05) j05;
            if (hhd.f(f05.a.Y, photoViewerWidget.l0())) {
                b68 b682 = f05.a;
                if (b682.a == photoViewerWidget.m0()) {
                    photoViewerWidget.n0().r(b682.o, true);
                }
            }
        }
        return jue.a;
    }
}
