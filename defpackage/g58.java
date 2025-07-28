package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: g58  reason: default package */
public final class g58 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g58(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g58 g58 = new g58(this.Y, continuation);
        g58.X = obj;
        return g58;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, ty4] */
    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        list.size();
        k77[] k77Arr = MediaGalleryWidget.Z;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        mediaGalleryWidget.l0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ((c46) mediaGalleryWidget.o.getValue()).E(list);
        mediaGalleryWidget.m0().X.m((Object) null, Integer.valueOf(list.size()));
        return jue.a;
    }
}
