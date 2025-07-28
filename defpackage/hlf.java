package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: hlf  reason: default package */
public final class hlf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hlf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hlf hlf = new hlf(continuation, this.Y);
        hlf.X = obj;
        return hlf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wlf wlf = (wlf) this.X;
        k77[] k77Arr = WebAppRootScreen.K0;
        rr3 rr3 = this.Y;
        rr3.getClass();
        if (wlf instanceof mlf) {
            mlf mlf = (mlf) wlf;
            rr3.z0().loadUrl(mlf.a);
            rr3.getArgs().putString("web_root_screen:url", mlf.a);
        } else {
            sgc sgc = null;
            if (wlf instanceof qlf) {
                String str = ((qlf) wlf).a;
                Bundle g = wn6.g(1, "dialog_id");
                String string = rr3.getContext().getResources().getString(vub.web_app_root_close_dialog_subtitle, new Object[]{str});
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 c = rf0.c(vub.web_app_root_close_dialog_title, 4, g);
                c.f(new lge(string));
                c.a(new kc3(1, new hge(vub.web_app_root_close_dialog_accept), 3, false));
                c.a(new kc3(2, new hge(vub.web_app_root_close_dialog_decline), 2, false));
                ConfirmationBottomSheet e = c.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                e.y0(rr3);
                if (sgc != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                }
            } else if (wlf instanceof klf) {
                rr3.r0(true);
                rr3.B0(((klf) wlf).a);
            } else if (wlf instanceof plf) {
                k77 k77 = WebAppRootScreen.K0[8];
                vpf vpf = (vpf) rr3.I0.getValue();
                plf plf = (plf) wlf;
                String str2 = plf.a;
                vpf.getClass();
                vpf.a.evaluateJavascript(String.format("\n            (() => {\n                WebApp.sendEvent(\"%s\", \"%s\");\n            })();\n        ", Arrays.copyOf(new Object[]{str2, p0e.P(plf.b, "\"", "\\\"")}, 2)), (ValueCallback) null);
            } else if (wlf instanceof tlf) {
                String str3 = ((tlf) wlf).a;
                Bundle g2 = wn6.g(2, "dialog_id");
                String string2 = rr3.getContext().getResources().getString(vub.web_app_root_phone_request_dialog_subtitle, new Object[]{str3});
                k77[] k77Arr3 = BottomSheetWidget.B0;
                jc3 c2 = rf0.c(vub.web_app_root_phone_request_dialog_title, 4, g2);
                c2.f(new lge(string2));
                c2.a(new kc3(1, new hge(vub.web_app_root_phone_request_dialog_accept), 3, false));
                c2.a(new kc3(2, new hge(vub.web_app_root_phone_request_dialog_decline), 2, false));
                ConfirmationBottomSheet e2 = c2.e();
                e2.setTargetController(rr3);
                rr3 rr33 = rr3;
                while (rr33.getParentController() != null) {
                    rr33 = rr33.getParentController();
                }
                ygc ygc2 = rr33 instanceof ygc ? (ygc) rr33 : null;
                if (ygc2 != null) {
                    sgc = ygc2.S();
                }
                e2.y0(rr3);
                if (sgc != null) {
                    vgc vgc2 = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc2, true, "BottomSheetWidget");
                    sgc.G(vgc2);
                }
            } else if (wlf instanceof nlf) {
                String str4 = ((nlf) wlf).a;
                if (str4.length() != 0) {
                    try {
                        rr3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                    } catch (ActivityNotFoundException e3) {
                        e3.getMessage();
                    }
                }
            } else if (wlf instanceof llf) {
                rr3.B0(true);
                rr3.s0();
                lkf.c.P1().b(":link-intercept", jjd.j(new wia[]{new wia("link", ((llf) wlf).a)}));
            } else if (wlf instanceof ulf) {
                ulf ulf = (ulf) wlf;
                rr3.G0.o1(rr3, WebAppRootScreen.K0[6], xs7.E(rr3.getViewLifecycleScope(), (hu3) null, ru3.b, new jlf(ulf.a, rr3, ulf.b, (Continuation) null), 1));
            } else if (wlf instanceof slf) {
                rr3.startActivityForResult(((slf) wlf).a.createIntent(), 1013);
            } else if (wlf instanceof vlf) {
                String str5 = ((vlf) wlf).a;
                Uri[] uriArr = str5 != null ? new Uri[]{Uri.parse(str5)} : null;
                ValueCallback<Uri[]> filePathCallback = rr3.z0().getFilePathCallback();
                if (filePathCallback != null) {
                    filePathCallback.onReceiveValue(uriArr);
                    rr3.z0().setFilePathCallback((ValueCallback<Uri[]>) null);
                }
            } else if (wlf instanceof rlf) {
                String str6 = ((rlf) wlf).a;
                Bundle g3 = wn6.g(3, "dialog_id");
                k77[] k77Arr4 = BottomSheetWidget.B0;
                jc3 c3 = rf0.c(vub.web_app_root_download_file_bottomsheet_title, 4, g3);
                c3.f(new jge(vub.web_app_root_download_file_bottomsheet_subtitle, cs.g0(new Object[]{str6})));
                c3.a(new kc3(1, new hge(vub.web_app_root_download_file_bottomsheet_accept), 4, false));
                c3.a(new kc3(2, new hge(vub.web_app_root_download_file_bottomsheet_decline), 2, false));
                ConfirmationBottomSheet e4 = c3.e();
                e4.setTargetController(rr3);
                rr3 rr34 = rr3;
                while (rr34.getParentController() != null) {
                    rr34 = rr34.getParentController();
                }
                ygc ygc3 = rr34 instanceof ygc ? (ygc) rr34 : null;
                if (ygc3 != null) {
                    sgc = ygc3.S();
                }
                e4.y0(rr3);
                if (sgc != null) {
                    vgc vgc3 = new vgc(e4, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc3, true, "BottomSheetWidget");
                    sgc.G(vgc3);
                }
            } else if (hhd.f(wlf, olf.a)) {
                rr3.z0().reload();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
