package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallBottomPanelWidget extends Widget implements tq3 {
    public static final /* synthetic */ k77[] w0;
    public final e3 X;
    public nq3 Y;
    public final n0c Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;

    static {
        Class<CallBottomPanelWidget> cls = CallBottomPanelWidget.class;
        w0 = new k77[]{new khb(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), c3d.g(m7c.a, cls, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;"), new khb(cls, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewWrapper;", 0)};
    }

    public CallBottomPanelWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    public final h01 l0() {
        return (h01) this.Z.T0(this, w0[2]);
    }

    public final u01 m0() {
        return (u01) this.o.getValue();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calls.ui.ui.call.panels.CallBottomPanelWidget] */
    public final void onAttach(View view) {
        CallBottomPanelWidget.super.onAttach(view);
        bc bcVar = m0().Z;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(bcVar, getViewLifecycleOwner().R(), ob7), new w01((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().w0, getViewLifecycleOwner().R(), ob7), new x01((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().y0, getViewLifecycleOwner().R(), ob7), new y01((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().z0, getViewLifecycleOwner().R(), ob7), new z01((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h01 h01 = new h01(getContext());
        h01.setId(uob.call_bottom_control);
        h01.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return h01;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, java.lang.Object, one.me.calls.ui.ui.call.panels.CallBottomPanelWidget] */
    public final void onDestroyView(View view) {
        CallBottomPanelWidget.super.onDestroyView(view);
        this.X.o1(this, w0[1], (Object) null);
        l0().a();
        nq3 nq3 = this.Y;
        if (nq3 != null) {
            nq3.dismiss();
        }
        this.Y = null;
    }

    public final void onDismiss() {
        this.Y = null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calls.ui.ui.call.panels.CallBottomPanelWidget] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallBottomPanelWidget.super.onRequestPermissionsResult(i, strArr, iArr);
        t97 t97 = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((qna) t97.getValue()).b(qna.l);
        if (i == 160 && ((qna) t97.getValue()).b(qna.h)) {
            z = true;
        }
        hy7 hy7 = hy7.b;
        if (z2) {
            m0().u(hy7);
        } else if (z) {
            m0().s(hy7);
        }
        if (z2 || z) {
            im requireActivity = requireActivity();
            ((dj1) this.b.getValue()).getClass();
            dj1.d(requireActivity);
        }
    }

    public final void onViewCreated(View view) {
        l0().setClickListener(new lv1(5, this));
    }

    public final void y(int i, Bundle bundle) {
        Object obj;
        CallsAudioDeviceInfo b2;
        u01 m0 = m0();
        Iterator it = m0.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((l31) obj).getId() == i) {
                break;
            }
        }
        l31 l31 = (l31) obj;
        if (l31 != null && (b2 = l31.b()) != null) {
            m0.r().j(b2);
        }
    }

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, new inc("default"), "arg_key_scope_id");
        z11 z11 = z11.a;
        this.a = z11.getAccessor().d(qna.class);
        this.b = z11.getAccessor().d(dj1.class);
        k77 k77 = w0[0];
        this.c = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, aj1.class, (s16) null);
        this.o = createViewModelLazy(u01.class, new s(7, new c6(16, this)));
        this.X = hwf.t();
        this.Z = viewBinding(uob.call_bottom_control);
    }
}
