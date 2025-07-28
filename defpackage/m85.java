package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: m85  reason: default package */
public final class m85 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m85(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m85 m85 = new m85(this.Z, continuation);
        m85.Y = obj;
        return m85;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        String str;
        String str2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            pb5 pb5 = faqWebViewWidget.X;
            this.Y = ou32;
            this.X = 1;
            Object b = pb5.b(this);
            if (b == pu3) {
                return pu3;
            }
            ou3 ou33 = ou32;
            obj = b;
            ou3 = ou33;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) obj;
        str3.getClass();
        if (str3.startsWith("mailto:")) {
            int indexOf = str3.indexOf(35);
            String substring = indexOf != -1 ? str3.substring(0, indexOf) : str3;
            int indexOf2 = substring.indexOf(63);
            if (indexOf2 == -1) {
                str = Uri.decode(substring.substring(7));
                str2 = null;
            } else {
                str = Uri.decode(substring.substring(7, indexOf2));
                str2 = substring.substring(indexOf2 + 1);
            }
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split("=", 2);
                    if (split2.length != 0) {
                        hashMap.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String str4 = (String) hashMap.get("to");
            if (str4 != null) {
                str = me4.i(str, ", ", str4);
            }
            hashMap.put("to", str);
            String u = d8.u(faqWebViewWidget.getContext(), zea.a);
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str3));
            intent.putExtra("android.intent.extra.SUBJECT", (String) hashMap.get("subject"));
            intent.putExtra("android.intent.extra.CC", (String) hashMap.get("cc"));
            intent.putExtra("android.intent.extra.TEXT", (String) hashMap.get("body"));
            try {
                faqWebViewWidget.startActivity(Intent.createChooser(intent, u));
            } catch (ActivityNotFoundException e) {
                udd.s(ou3.getClass().getName(), "error no email app found", e);
            }
            return jue.a;
        }
        throw new RuntimeException("Not a mailto scheme");
    }
}
