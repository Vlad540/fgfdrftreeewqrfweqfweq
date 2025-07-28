package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Lkl1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallTopPanelWidget extends Widget implements tq3, kl1 {
    public static final /* synthetic */ k77[] o;
    public final t97 a;
    public final t97 b;
    public final n0c c;

    static {
        Class<CallTopPanelWidget> cls = CallTopPanelWidget.class;
        o = new k77[]{new khb(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wn6.e(m7c.a, cls, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewWrapper;", 0)};
    }

    public CallTopPanelWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    public final jl1 l0() {
        return (jl1) this.c.T0(this, o[1]);
    }

    public final ml1 m0() {
        return (ml1) this.b.getValue();
    }

    public final void onAttach(View view) {
        ez3.N(new ck5(wx3.e(m0().o, getViewLifecycleOwner().R(), ob7.o), new pl1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jl1 jl1 = new jl1(getContext());
        jl1.setId(uob.call_top_control);
        return jl1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    public final void onDestroyView(View view) {
        CallTopPanelWidget.super.onDestroyView(view);
        l0().a();
    }

    public final void onViewCreated(View view) {
        l0().setClickListener(new lhd(6, this));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    public final void x(yk1 yk1) {
        if (((aj1) this.a.getValue()).u() && getView() != null) {
            int i = yk1 != null ? yk1.a : 0;
            int i2 = i == 0 ? -1 : ol1.$EnumSwitchMapping$0[hr1.t(i)];
            if (i2 == -1) {
                return;
            }
            if (i2 == 1) {
                l0().setTitle(yk1.b);
                l0().setStatus(yk1.c);
            } else if (i2 == 2) {
                l0().setTitle((CharSequence) null);
                l0().setStatus((CharSequence) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        if (i == o1a.F) {
            taf.o(m0().b.Q0, ih1.C);
        } else if (i == o1a.q) {
            taf.o(m0().b.Q0, jh1.C);
        }
    }

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, new inc("default"), "arg_key_scope_id");
        k77 k77 = o[0];
        this.a = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, aj1.class, (s16) null);
        this.b = createViewModelLazy(ml1.class, new s(19, new nl1(0, this)));
        this.c = viewBinding(uob.call_top_control);
    }
}
