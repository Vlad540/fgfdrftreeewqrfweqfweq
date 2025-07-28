package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: i58  reason: default package */
public final class i58 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i58(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        n(bool, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i58 i58 = new i58(this.Y, continuation);
        i58.X = ((Boolean) obj).booleanValue();
        return i58;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        k77[] k77Arr = MediaGalleryWidget.Z;
        this.Y.l0().setRefreshingNext(z);
        return jue.a;
    }
}
