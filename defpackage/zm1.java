package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: zm1  reason: default package */
public final class zm1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zm1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                an1 an1 = (an1) obj2;
                f5f b2 = an1.getVideoLayoutUpdatesController();
                if (b2 != null) {
                    b2.a((View) ((l7c) obj).a, an1.z0);
                    return;
                }
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr = MediaGalleryWidget.Z;
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj2;
                int i9 = mediaGalleryWidget.n0().C0.c;
                int i10 = mediaGalleryWidget.n0().C0.d - (mediaGalleryWidget.n0().C0.d / i9);
                f56 m0 = mediaGalleryWidget.m0();
                m0.getClass();
                taf.o(m0.c, new c56((((View) obj).getWidth() / i9) - i10));
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                jq8 jq8 = (jq8) obj2;
                int measuredHeight = jq8.c.getMeasuredHeight();
                ImageView imageView = jq8.b;
                int measuredHeight2 = imageView.getMeasuredHeight();
                t97 t97 = jq8.w0;
                int i11 = 0;
                if (measuredHeight <= Math.min(measuredHeight2, ek8.C(t97))) {
                    z = false;
                }
                int c2 = z ? (int) (((double) ah4.c(jp2.l.g((yq4) obj), jq8.getContext())) * 0.2d) : 0;
                jq8.a = me4.c((float) 4, dh4.c().getDisplayMetrics().density, c2);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = jq8.a;
                    imageView.setLayoutParams(marginLayoutParams);
                    if (t97.a()) {
                        ImageView imageView2 = (ImageView) t97.getValue();
                        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                        if (layoutParams2 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.bottomMargin = jq8.a;
                            imageView2.setLayoutParams(marginLayoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    ImageView imageView3 = jq8.z0;
                    ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (z) {
                            i11 = c2;
                        }
                        marginLayoutParams3.bottomMargin = i11;
                        imageView3.setLayoutParams(marginLayoutParams3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 3:
                view.removeOnLayoutChangeListener(this);
                flb flb = (flb) obj2;
                if (tge.c(flb.getTitleView())) {
                    k77[] k77Arr2 = MessageWriteWidget.J0;
                    ((MessageWriteWidget) obj).getClass();
                    MessageWriteWidget.A0(flb, true);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr3 = NeuroAvatarsScreen.Q0;
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) obj;
                neuroAvatarsScreen.getClass();
                k77[] k77Arr4 = NeuroAvatarsScreen.Q0;
                k77 k77 = k77Arr4[6];
                n0c n0c = neuroAvatarsScreen.z0;
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((View) n0c.T0(neuroAvatarsScreen, k77Arr4[6])).getPaddingBottom() + ((View) n0c.T0(neuroAvatarsScreen, k77)).getMeasuredHeight());
                return;
            default:
                View view2 = (View) obj2;
                if (view2.getVisibility() == 0) {
                    ((l9e) obj).d(view2);
                    return;
                }
                return;
        }
    }

    public zm1(l9e l9e, View view) {
        this.a = 5;
        this.c = l9e;
        this.b = view;
    }
}
