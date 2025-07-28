package one.me.chats.picker.chats;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B=\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsTabWidget2;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "", "isInMultiSelect", "Lkotlin/Function1;", "Ljue;", "onMultiSelectToggled", "Lq72;", "filter", "(Ljava/lang/String;ZLu16;Lq72;Lx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsTabWidget2 extends Widget {
    public static final /* synthetic */ k77[] C0;
    public final qs5 A0;
    public final kre B0;
    public final u16 X;
    public final nl0 Y;
    public final nl0 Z;
    public final jr a;
    public final jr b;
    public final jr c;
    public final sy6 o;
    public final t97 w0;
    public ox3 x0;
    public final a30 y0;
    public final int z0;

    static {
        Class<PickerChatsTabWidget2> cls = PickerChatsTabWidget2.class;
        C0 = new k77[]{new khb(cls, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0), c3d.g(m7c.a, cls, "isInMultiSelect", "isInMultiSelect()Z"), new khb(cls, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new khb(cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new khb(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    }

    public PickerChatsTabWidget2(String str, boolean z, u16 u16, q72 q72, x54 x54) {
        this(jjd.j(new wia("scope.id", new inc(str)), new wia("is_in_multiselect", Boolean.valueOf(z)), new wia("picker.filter", q72)));
        this.X = u16;
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    public final hda l0() {
        k77 k77 = C0[3];
        return (hda) this.Y.getValue();
    }

    public final ViewPager2 m0() {
        k77 k77 = C0[4];
        return (ViewPager2) this.Z.getValue();
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
        ox3 ox3 = this.x0;
        if (ox3 != null) {
            ox3.c();
        }
        this.x0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qs5, f6c] */
    public final void onViewCreated(View view) {
        ViewPager2 m0 = m0();
        ? r0 = this.A0;
        m0.setAdapter(r0);
        m0().setOffscreenPageLimit(this.z0);
        ox3 b2 = this.y0.b(l0(), m0(), new qq9(17), new vg0(21));
        b2.a();
        this.x0 = b2;
        View childAt = m0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((k6c) null);
        }
        if (r0.D0.size() > 0) {
            m0().e(0, false);
            m0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        ez3.N(new ck5(ez3.z(new u09(((wra) this.w0.getValue()).y0, 19)), new jta(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.picker.chats.PickerChatsTabWidget2] */
    public PickerChatsTabWidget2(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, "scope.id");
        this.a = jrVar;
        this.b = new jr(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.c = new jr(q72.class, "picker.filter");
        this.o = sy6.c;
        this.Y = binding(new gta(this, 0));
        this.Z = binding(new gta(this, 1));
        k77 k77 = C0[0];
        this.w0 = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, wra.class, (s16) null);
        t97 createViewModelLazy = createViewModelLazy(ata.class, new wq9(8, new qga(10)));
        this.y0 = new a30((ExecutorService) null, 6);
        this.z0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(kra.a, 30);
        this.A0 = new qs5(this, bVar, new ss8(18, this));
        kre kre = new kre();
        kre.T(new cre());
        kre.T(new fdf());
        kre.W(0);
        kre.J(150);
        this.B0 = kre;
        ez3.N(new ck5(((ata) createViewModelLazy.getValue()).b, new hta(this, (Continuation) null), 5), getLifecycleScope());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerChatsTabWidget2(String str, boolean z, u16 u16, q72 q72, int i, x54 x54) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : u16, (i & 8) != 0 ? q72.a : q72, (x54) null);
    }
}
