package one.me.sdk.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Lq46;", "galleryMode", "(Ljava/lang/String;Lq46;Lx54;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ k77[] Z;
    public final nl0 X;
    public final t61 Y;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final r7e o;

    static {
        k77 khb = new khb(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0);
        m7c.a.getClass();
        Z = new k77[]{khb};
    }

    public MediaGalleryWidget(String str, q46 q46, x54 x54) {
        this(jjd.j(new wia[]{new wia("arg_scope_id", new inc(str)), new wia("arg_gallery_mode", q46)}));
    }

    public final ty4 l0() {
        k77 k77 = Z[0];
        return (ty4) this.X.getValue();
    }

    public final f56 m0() {
        return (f56) this.b.getValue();
    }

    public final m66 n0() {
        return (m66) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, ty4] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(l0());
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        m66 n0 = n0();
        j56 a2 = hhd.a(n0.c);
        n0.C0 = a2;
        udd.q("m66", "did recalculate uiOptions: " + a2);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new zm1(this, 1, view));
        } else {
            int i = n0().C0.c;
            int width = view.getWidth() / i;
            f56 m0 = m0();
            m0.getClass();
            taf.o(m0.c, new c56(width - (n0().C0.d - (n0().C0.d / i))));
        }
        RecyclerView l0 = l0();
        l0.setPager(this.Y);
        l0.setProgressView(t9a.a);
        l0.setHasFixedSize(true);
        l0.setThreshold(n0().C0.b);
        l0.setAdapter((c46) this.o.getValue());
        l0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(n0().C0.c);
        gridLayoutManager.C = n0().C0.c * 4;
        l0.setLayoutManager(gridLayoutManager);
        l0.j(new vi2(n0().C0.c, n0().C0.d, 3));
        l0.setItemAnimator(n0().C0.g ? new w84() : null);
        l0.m(new my4(3, this));
        ez3.N(new ck5(n0().B0, new g58(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().I0, new h58(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().E0, new i58(this, (Continuation) null), 5), getViewLifecycleScope());
        e07.B(new ck5(m0().o, new j58(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = rna.a.b();
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_scope_id", cls);
        if (E != null) {
            this.b = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E)).a, f56.class, (s16) null);
            this.c = createViewModelLazy(m66.class, new js5(19, new zu4((Object) bundle, 13, (Object) this)));
            this.o = new r7e(new f58(this, 0));
            this.X = binding(new f58(this, 1));
            this.Y = new t61(this, 4);
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaGalleryWidget(java.lang.String r1, defpackage.q46 r2, int r3, x54 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0008
            android.os.Parcelable$Creator<q46> r2 = defpackage.q46.CREATOR
            q46 r2 = defpackage.q46.x0
        L_0x0008:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.gallery.MediaGalleryWidget.<init>(java.lang.String, q46, int, x54):void");
    }
}
