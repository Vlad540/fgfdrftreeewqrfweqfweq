package one.me.folders.pickerfolders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatId", "(J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ k77[] w0;
    public final n0c X;
    public final n0c Y;
    public final nl0 Z;
    public final sy6 a;
    public final jr b;
    public final t97 c;
    public final mr5 o;

    static {
        Class<FoldersPickerScreen> cls = FoldersPickerScreen.class;
        khb khb = new khb(cls, "serverChatId", "getServerChatId()J", 0);
        n7c n7c = m7c.a;
        w0 = new k77[]{khb, wn6.e(n7c, cls, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, n7c)};
    }

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        this.b = new jr(Long.class, 0L, "arg_chat_id");
        this.c = createViewModelLazy(ft5.class, new js5(1, new ss5(this, 0)));
        this.o = new mr5(((x4a) as5.a.getAccessor().c(x4a.class)).a(), (Object) new f(1, this, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 24), 7);
        this.X = viewBinding(d5a.m);
        viewBinding(d5a.o);
        this.Y = viewBinding(d5a.d);
        this.Z = binding(new ss5(this, 1));
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final ft5 l0() {
        return (ft5) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [mr5, f6c] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nea nea = new nea(getContext(), 6);
        nea.setId(d5a.o);
        nea.setForm(fea.a);
        nea.setTitle(f5a.q);
        nea.setLeftActions(new vda(new ts5(this, 0)));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(d5a.d);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(f5a.h);
        a24.Z(oneMeButton, 300, new us5(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(d5a.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        float f = (float) 6;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        ts5 ts5 = new ts5(this, 1);
        recyclerView.j(new tw2(new vs5(recyclerView, 0), new ts5(this, 2), ts5, ts5));
        recyclerView.l(new u24(recyclerView));
        recyclerView.j(new iq(7));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(d5a.n);
        re3 re3 = new re3(0, -2);
        re3.i = 0;
        re3.e = 0;
        re3.h = 0;
        constraintLayout.addView(nea, re3);
        re3 re32 = new re3(0, 0);
        re32.j = nea.getId();
        re32.e = 0;
        re32.h = 0;
        re32.k = oneMeButton.getId();
        constraintLayout.addView(recyclerView, re32);
        re3 re33 = new re3(0, -2);
        re33.e = 0;
        re33.h = 0;
        re33.l = 0;
        float f2 = (float) 12;
        re33.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, re33);
        urd.B(new z9(3, (Continuation) null, 14), constraintLayout);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        t0c t0c = l0().x0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new xs5((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().C0, getViewLifecycleOwner().R(), ob7), new ys5((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().z0, getViewLifecycleOwner().R(), ob7), new zs5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public FoldersPickerScreen(long j) {
        this(jjd.j(new wia("arg_chat_id", Long.valueOf(j))));
    }
}
