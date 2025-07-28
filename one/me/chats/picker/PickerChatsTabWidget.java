package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chats/picker/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsTabWidget extends Widget {
    public static final /* synthetic */ k77[] z0;
    public final t97 X;
    public ox3 Y;
    public final a30 Z;
    public final jr a;
    public final sy6 b;
    public final nl0 c;
    public final nl0 o;
    public final int w0;
    public final qs5 x0;
    public final kre y0;

    static {
        Class<PickerChatsTabWidget> cls = PickerChatsTabWidget.class;
        khb khb = new khb(cls, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0);
        n7c n7c = m7c.a;
        z0 = new k77[]{khb, wn6.e(n7c, cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wn6.f(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c)};
    }

    public PickerChatsTabWidget(String str, x54 x54) {
        this(jjd.j(new wia("scope.id", new inc(str))));
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final hda l0() {
        k77 k77 = z0[1];
        return (hda) this.c.getValue();
    }

    public final ViewPager2 m0() {
        k77 k77 = z0[2];
        return (ViewPager2) this.o.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        hda l0 = l0();
        re3 re3 = new re3(0, -2);
        re3.i = 0;
        re3.e = 0;
        re3.h = 0;
        constraintLayout.addView(l0, re3);
        ViewPager2 m0 = m0();
        re3 re32 = new re3(0, 0);
        re32.j = f2a.e;
        re32.l = 0;
        re32.e = 0;
        re32.h = 0;
        constraintLayout.addView(m0, re32);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        ox3 ox3 = this.Y;
        if (ox3 != null) {
            ox3.c();
        }
        this.Y = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qs5, f6c] */
    public final void onViewCreated(View view) {
        ViewPager2 m0 = m0();
        ? r0 = this.x0;
        m0.setAdapter(r0);
        m0().setOffscreenPageLimit(this.w0);
        ox3 b2 = this.Z.b(l0(), m0(), new qq9(16), new vg0(20));
        b2.a();
        this.Y = b2;
        View childAt = m0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((k6c) null);
        }
        if (r0.D0.size() > 0) {
            m0().e(0, false);
            m0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        ez3.N(new ck5(ez3.z(new u09(((xra) this.X.getValue()).E0, 18)), new fta(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.chats.picker.PickerChatsTabWidget, rr3, one.me.sdk.arch.Widget, java.lang.Object] */
    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, "scope.id");
        this.a = jrVar;
        this.b = sy6.c;
        this.c = binding(new cta(this, 0));
        this.o = binding(new cta(this, 1));
        k77 k77 = z0[0];
        this.X = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, xra.class, (s16) null);
        t97 createViewModelLazy = createViewModelLazy(bta.class, new wq9(7, new qga(9)));
        this.Z = new a30((ExecutorService) null, 6);
        this.w0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(kra.a, 30);
        this.x0 = new qs5(this, bVar, new ss8(17, this));
        kre kre = new kre();
        kre.T(new cre());
        kre.T(new fdf());
        kre.W(0);
        kre.J(150);
        this.y0 = kre;
        setRetainViewMode(qr3.b);
        ez3.N(new ck5(((bta) createViewModelLazy.getValue()).b, new dta(this, (Continuation) null), 5), getLifecycleScope());
    }
}
