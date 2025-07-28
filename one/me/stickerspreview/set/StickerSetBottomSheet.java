package one.me.stickerspreview.set;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "aud", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ k77[] E0;
    public final n0c A0;
    public final cpf B0;
    public final int C0;
    public final nl0 D0;
    public final t97 w0;
    public final jr x0;
    public er7 y0;
    public final n0c z0;

    static {
        Class<StickerSetBottomSheet> cls = StickerSetBottomSheet.class;
        k77 khb = new khb(cls, "stickerId", "getStickerId()J", 0);
        n7c n7c = m7c.a;
        E0 = new k77[]{khb, wn6.e(n7c, cls, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), wn6.f(cls, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c), wn6.f(cls, "loadingView", "getLoadingView()Landroid/view/View;", 0, n7c)};
    }

    public StickerSetBottomSheet(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str))}));
    }

    public static final int w0(StickerSetBottomSheet stickerSetBottomSheet) {
        aud parentController = stickerSetBottomSheet.getParentController();
        aud aud = parentController instanceof aud ? parentController : null;
        if (aud == null) {
            return 0;
        }
        StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) aud;
        k77[] k77Arr = StickerPreviewScreen.E0;
        return ((ViewGroup) stickerPreviewScreen.x0.T0(stickerPreviewScreen, k77Arr[4])).getMeasuredHeight() + ((nea) stickerPreviewScreen.w0.T0(stickerPreviewScreen, k77Arr[3])).getBottom();
    }

    public final boolean handleBack() {
        return false;
    }

    public final t0b m0() {
        return new x9(this, 5);
    }

    public final sy6 n0() {
        sy6 sy6 = sy6.c;
        return sy6.c;
    }

    public final void onAttach(View view) {
        k77 k77 = E0[0];
        ((ttd) this.w0.getValue()).q(Long.valueOf(((Number) this.x0.a(this)).longValue()));
    }

    public final void onViewCreated(View view) {
        a24.a0(view, new ztd(this, 0));
        ez3.N(new ck5(((ttd) this.w0.getValue()).G0, new kbb(2, this, StickerSetBottomSheet.class, "handleStickerSet", "handleStickerSet(Lone/me/sdk/stickers/model/StickerSetModel;)V", 4, 9), 5), getViewLifecycleScope());
    }

    public final void s0() {
    }

    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = (float) 10;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 12;
        frameLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), X, a24.X(f2 * dh4.c().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        gwd gwd = new gwd(linearLayout.getContext());
        gwd.setId(mca.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        float f3 = (float) 4;
        layoutParams.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
        gwd.setLayoutParams(layoutParams);
        a24.a0(gwd.getHeaderButton(), new ztd(this, 1));
        linearLayout.addView(gwd);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(mca.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int t = gp0.t(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(t));
        recyclerView.j(new ix0(t, a24.X(f3 * dh4.c().getDisplayMetrics().density), 7));
        recyclerView.k(new i87(2, this));
        recyclerView.setAdapter(this.B0);
        afa.a(recyclerView, new p36(recyclerView, recyclerView, this, 22));
        linearLayout.addView(recyclerView);
        k77 k77 = E0[3];
        linearLayout.addView((View) this.D0.getValue());
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        sm4 sm4 = new sm4(frameLayout.getContext());
        sm4.setTranslationY((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, -X));
        frameLayout.addView(sm4);
    }

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, Widget.ARG_SCOPE_ID, cls);
        if (E != null) {
            this.w0 = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E)).a, ttd.class, (s16) null);
            this.x0 = new jr(Long.class, 0L, "arg_key_sticker_id");
            this.z0 = viewBinding(mca.j);
            this.A0 = viewBinding(mca.i);
            this.B0 = new cpf(((x4a) bvd.a.getAccessor().c(x4a.class)).a(), new wwc(25, this));
            this.C0 = a24.X(((float) 183) * dh4.c().getDisplayMetrics().density);
            this.D0 = binding(new u5b(28, this));
            u0(false);
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
