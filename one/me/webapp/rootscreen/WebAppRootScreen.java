package one.me.webapp.rootscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\b\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Llc3;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Lbff;", "entryPoint", "chatId", "", "startParam", "", "isFullscreen", "", "requestCode", "(JLbff;Ljava/lang/Long;Ljava/lang/String;ZI)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController", "SetJavaScriptEnabled"})
public final class WebAppRootScreen extends BaseBottomSheetWidget implements lc3, tq3 {
    public static final /* synthetic */ k77[] K0;
    public final jr A0;
    public final jr B0;
    public final t97 C0;
    public mif D0;
    public final jj7 E0;
    public final t97 F0;
    public final e3 G0;
    public final n0c H0;
    public final nl0 I0;
    public final n0c J0;
    public final jr w0;
    public final jr x0;
    public final jr y0;
    public final jr z0;

    static {
        Class<WebAppRootScreen> cls = WebAppRootScreen.class;
        K0 = new k77[]{new hc9(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;"), c3d.g(m7c.a, cls, "botId", "getBotId()J"), new hc9(cls, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;"), new hc9(cls, "startParam", "getStartParam()Ljava/lang/String;"), new hc9(cls, "isFullscreen", "isFullscreen()Z"), new khb(cls, "requestCode", "getRequestCode()I", 0), new hc9(cls, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;"), new khb(cls, "webView", "getWebView()Lone/me/webapp/rootscreen/ScrollTrackingWebView;", 0), new khb(cls, "webViewEventSender", "getWebViewEventSender()Lone/me/webapp/rootscreen/WebViewEventSender;", 0), new khb(cls, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public WebAppRootScreen() {
        this((Bundle) null, 1, (x54) null);
    }

    public static void C0(nea nea, boolean z) {
        b1f b1f;
        int C = xy6.C(tge.e(nea.getTitle()));
        int i = 0;
        if (z) {
            b1f a = tge.a(nea.getTitle());
            if ((a != null ? a.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a2 = tge.a(nea.getTitle());
            if (a2 != null) {
                i = a2.a;
            }
            if (i != C) {
                b1f = new b1f(nea.getContext(), C, new u1c(29));
                tge.d(nea.getTitle(), b1f);
            }
        }
        b1f = null;
        tge.d(nea.getTitle(), b1f);
    }

    public static final void w0(WebAppRootScreen webAppRootScreen, Intent intent, hnf hnf) {
        t97 t97;
        Intent intent2;
        webAppRootScreen.getClass();
        byte[] bArr = hnf.a;
        String str = HTTP.PLAIN_TEXT_TYPE;
        if (bArr != null) {
            String str2 = hnf.b;
            String str3 = str2 == null ? "file" : str2;
            int i = 0;
            File file = null;
            while (true) {
                t97 = webAppRootScreen.F0;
                if (file != null && !file.exists()) {
                    break;
                } else if (i == 100) {
                    file = null;
                    break;
                } else {
                    file = ((mg5) t97.getValue()).i(hr1.g(str3, i > 0 ? rf0.f(i, " (", ")") : ""));
                    i++;
                }
            }
            if (file != null) {
                dy dyVar = new dy(file, (r34) null);
                FileOutputStream f = dyVar.f();
                if (f != null) {
                    try {
                        f.write(bArr);
                        dyVar.b(f);
                    } catch (Throwable th) {
                        dyVar.a(f);
                        throw th;
                    }
                }
                String str4 = hnf.c;
                if (str4 != null) {
                    str = str4;
                }
                try {
                    intent.setType(str);
                    if (str2 != null) {
                        intent.putExtra("android.intent.extra.TITLE", str2);
                    }
                    intent.putExtra("android.intent.extra.STREAM", ((mg5) t97.getValue()).f(webAppRootScreen.getContext(), file));
                    intent2 = intent.addFlags(1);
                } catch (Throwable th2) {
                    intent2 = new kcc(th2);
                }
                Throwable a = mcc.a(intent2);
                if (a != null) {
                    a.toString();
                    return;
                }
                return;
            }
            return;
        }
        intent.setType(str);
    }

    public final boolean A0() {
        k77 k77 = K0[4];
        return ((Boolean) this.A0.a(this)).booleanValue();
    }

    public final void B0(boolean z) {
        Object obj;
        ArrayList e = getRouter().e();
        ListIterator listIterator = e.listIterator(e.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((vgc) obj).a instanceof gy5) {
                break;
            }
        }
        vgc vgc = (vgc) obj;
        rr3 rr3 = vgc != null ? vgc.a : null;
        gy5 gy5 = rr3 instanceof gy5 ? (gy5) rr3 : null;
        if (gy5 != null) {
            k77[] k77Arr = K0;
            k77 k77 = k77Arr[5];
            jr jrVar = this.B0;
            if (((Number) jrVar.a(this)).intValue() != 0) {
                int i = z ? -1 : 0;
                k77 k772 = k77Arr[5];
                gy5.Q(((Number) jrVar.a(this)).intValue(), i, (Intent) null);
            }
        }
    }

    public final void D0(boolean z) {
        x0().setLeftActions(z ? new vda(new flf(this, 2)) : new wda(new flf(this, 3)));
    }

    public final void E(Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            y0().t(false);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            y0().u(false);
        }
    }

    public final rnc getScreenDelegate() {
        return this.E0;
    }

    public final boolean handleBack() {
        kmf y02 = y0();
        if (((Boolean) y02.I0.getValue()).booleanValue()) {
            b0d b0d = y02.G0;
            b0d.getClass();
            xs7.E((ou3) b0d.b, (hu3) null, (ru3) null, new l57(b0d, (Continuation) null), 3);
            return true;
        }
        taf.n(y02, (hu3) null, (ru3) null, new bmf(y02, (Continuation) null), 3);
        return true;
    }

    public final void i(int i, Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            if (i == 1) {
                kmf y02 = y0();
                y02.getClass();
                taf.o(y02.O0, new klf(false));
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (i == 1) {
                y0().v(true);
            } else if (i == 2) {
                y0().v(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            if (i == 1) {
                y0().u(true);
            } else if (i == 2) {
                y0().u(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 4) {
            if (i == 1) {
                zgf s = y0().s();
                xs7.E(s.c, s.e().a(), (ru3) null, new hgf(s, (Continuation) null, true), 2);
            } else if (i == 2) {
                zgf s2 = y0().s();
                xs7.E(s2.c, s2.e().a(), (ru3) null, new hgf(s2, (Continuation) null, false), 2);
            }
        } else if (valueOf == null || valueOf.intValue() != 5) {
        } else {
            if (i == 1) {
                y0().t(true);
            } else if (i == 2) {
                y0().t(false);
            }
        }
    }

    public final t0b m0() {
        return new lb2(this, 1);
    }

    public final sy6 n0() {
        if (!A0()) {
            return this.o;
        }
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1013 && z0().getFilePathCallback() != null) {
            String str = null;
            if (i2 == -1) {
                if ((intent != null ? intent.getDataString() : null) != null) {
                    str = intent.getDataString();
                }
            }
            kmf y02 = y0();
            y02.getClass();
            taf.o(y02.O0, new vlf(str));
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new mp0(15, this));
        } else if (tge.c(x0().getTitle())) {
            C0(x0(), true);
        }
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.D0 = null;
    }

    public final void onDismiss() {
        k77[] k77Arr = K0;
        k77 k77 = k77Arr[6];
        e3 e3Var = this.G0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[6], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        String string = getArgs().getString("web_root_screen:url");
        if (string != null) {
            z0().loadUrl(string);
        }
        this.D0 = new mif(requireActivity(), new e78(0, y0(), kmf.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 17), new e78(0, y0(), kmf.class, "onBiometryFail", "onBiometryFail()V", 0, 18));
        l05 l05 = y0().O0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new hlf((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e((dcd) y0().Q0.getValue(), getViewLifecycleOwner().R(), ob7), new ilf((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final boolean q0() {
        kmf y02 = y0();
        if (!((Boolean) y02.J0.getValue()).booleanValue()) {
            return true;
        }
        taf.n(y02, (hu3) null, (ru3) null, new bmf(y02, (Continuation) null), 3);
        return false;
    }

    public final void t0() {
        kmf y02 = y0();
        if (!y02.L0) {
            e57 e57 = y02.R0;
            if (e57 != null) {
                e57.b(new s0());
            }
            y02.R0 = null;
            y02.S0 = null;
            ConcurrentHashMap concurrentHashMap = y02.T0;
            concurrentHashMap.size();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((e57) entry.getValue()).b(new Throwable());
            }
            concurrentHashMap.clear();
            qod qod = y02.U0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            y02.U0 = null;
            k77[] k77Arr = kmf.V0;
            k77 k77 = k77Arr[0];
            e3 e3Var = y02.F0;
            g37 g37 = (g37) e3Var.T0(y02, k77);
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            e3Var.o1(y02, k77Arr[0], (Object) null);
        }
        kmf y03 = y0();
        if (!y03.L0) {
            y03.L0 = true;
            iff iff = (iff) y03.B0.getValue();
            jff jff = y03.E0;
            if (jff != null) {
                iff.a(2, jff.a, jff.b, jff.c, jff.d, (String) null);
            }
        }
    }

    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        flf flf = new flf(this, 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(vea.c);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        flf.invoke(linearLayout);
        frameLayout.addView(linearLayout);
    }

    public final nea x0() {
        return (nea) this.J0.T0(this, K0[9]);
    }

    public final void y(int i, Bundle bundle) {
        if (i == 1) {
            kmf y02 = y0();
            y02.getClass();
            qod n = taf.n(y02, (hu3) null, ru3.b, new cmf(y02, (Continuation) null), 1);
            y02.F0.o1(y02, kmf.V0[0], n);
        }
    }

    public final kmf y0() {
        return (kmf) this.C0.getValue();
    }

    public final lpc z0() {
        return (lpc) this.H0.T0(this, K0[7]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.w0 = new jr(cls, "web_root_screen:chat_id");
        this.x0 = new jr(cls, "web_root_screen:bot_id");
        this.y0 = new jr(bff.class, "web_root_screen:entry_point");
        this.z0 = new jr(String.class, "web_root_screen:start_param");
        this.A0 = new jr(Boolean.class, Boolean.FALSE, "web_root_screen:is_fullscreen");
        this.B0 = new jr(Integer.class, 0, "web_root_screen.request_code.key");
        this.C0 = createViewModelLazy(kmf.class, new ypd(9, new elf(this, 0)));
        this.E0 = new jj7(new vif(4), new e78(0, this, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0, 19), 4);
        this.F0 = uif.a.getAccessor().d(mg5.class);
        this.G0 = hwf.t();
        this.H0 = viewBinding(vea.j);
        this.I0 = binding(new elf(this, 1));
        this.J0 = viewBinding(vea.i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(long j, bff bff, Long l, String str, boolean z, int i, int i2, x54 x54) {
        this(j, bff, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    public WebAppRootScreen(long j, bff bff, Long l, String str, boolean z, int i) {
        this(jjd.j(new wia[]{new wia("web_root_screen:bot_id", Long.valueOf(j)), new wia("web_root_screen:entry_point", bff), new wia("web_root_screen:chat_id", l), new wia("web_root_screen:start_param", str), new wia("web_root_screen:is_fullscreen", Boolean.valueOf(z)), new wia("web_root_screen.request_code.key", Integer.valueOf(i))}));
    }
}
