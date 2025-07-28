package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: h58  reason: default package */
public final class h58 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h58(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((t46) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h58 h58 = new h58(this.Y, continuation);
        h58.X = obj;
        return h58;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        t46 t46 = (t46) this.X;
        if (!(t46 instanceof r46)) {
            if (t46 instanceof s46) {
                MediaGalleryWidget mediaGalleryWidget = this.Y;
                ((qna) mediaGalleryWidget.a.getValue()).g(new jrf(mediaGalleryWidget, 1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
