package one.me.folders.edit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Lnp5;", "Lgr5;", "", "folderId", "<init>", "(Ljava/lang/String;)V", "", "serverChatId", "(J)V", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FolderEditScreen extends Widget implements lc3, np5, gr5 {
    public static final /* synthetic */ k77[] w0;
    public final op5 X;
    public final n0c Y;
    public final n0c Z;
    public final sy6 a;
    public final jr b;
    public final jr c;
    public final t97 o;

    static {
        Class<FolderEditScreen> cls = FolderEditScreen.class;
        khb khb = new khb(cls, "folderId", "getFolderId()Ljava/lang/String;", 0);
        n7c n7c = m7c.a;
        w0 = new k77[]{khb, wn6.e(n7c, cls, "serverChatId", "getServerChatId()J", 0), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public FolderEditScreen(String str) {
        this(jjd.j(new wia("key_folder_id", str)));
    }

    public static final nea l0(FolderEditScreen folderEditScreen) {
        folderEditScreen.getClass();
        return (nea) folderEditScreen.Y.T0(folderEditScreen, w0[2]);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        rq5 m0 = m0();
        m0.getClass();
        if (i == d5a.d) {
            m0.u();
        } else if (i == d5a.c && m0.b != null) {
            taf.n(m0, m0.o.b(), (ru3) null, new lq5(m0, (Continuation) null), 2);
        }
    }

    public final rq5 m0() {
        return (rq5) this.o.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.folders.edit.FolderEditScreen] */
    public final void n0() {
        int i = e87.a;
        if (e87.b(e87.c)) {
            bm3.p(this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [f6c, op5] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nea nea = new nea(getContext(), 6);
        nea.setId(d5a.g);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new yp5(this, 0)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(d5a.e);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((k6c) null);
        r34 r34 = new r34(28, (Object) this);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), r34, (o8) null, 12));
        recyclerView.j(new vp5(r34));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(d5a.d);
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(f5a.h);
        a24.Z(oneMeButton, 300, new d5(28, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(d5a.f);
        re3 re3 = new re3(0, -2);
        re3.i = 0;
        re3.e = 0;
        re3.h = 0;
        constraintLayout.addView(nea, re3);
        re3 re32 = new re3(0, 0);
        re32.j = nea.getId();
        re32.e = 0;
        re32.h = 0;
        re32.l = 0;
        constraintLayout.addView(recyclerView, re32);
        re3 re33 = new re3(0, -2);
        re33.e = 0;
        re33.h = 0;
        re33.l = 0;
        float f = (float) 12;
        re33.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, re33);
        urd.B(new pf0(3, (Continuation) null, 6), constraintLayout);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        FolderEditScreen.super.onViewCreated(view);
        ez3.N(new ck5(m0().B0, new zp5(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().y0, new aq5(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public FolderEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        this.b = new jr(String.class, "key_folder_id");
        this.c = new jr(Long.class, 0L, "key_server_chat_id");
        this.o = createViewModelLazy(rq5.class, new rh2(29, new gz3(12, this)));
        op5 op5 = new op5(((x4a) as5.a.getAccessor().c(x4a.class)).a(), this);
        this.X = op5;
        this.Y = viewBinding(d5a.g);
        this.Z = viewBinding(d5a.d);
        ez3.N(new ck5(m0().A0, new hp0(2, op5, op5.class, "submitList", "submitList(Ljava/util/List;)V", 4, 16), 5), getLifecycleScope());
    }

    public FolderEditScreen(long j) {
        this(jjd.j(new wia("key_server_chat_id", Long.valueOf(j))));
    }

    public FolderEditScreen() {
        this((Bundle) null);
    }
}
