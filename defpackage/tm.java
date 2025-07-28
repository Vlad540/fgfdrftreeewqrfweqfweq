package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: tm  reason: default package */
public final class tm extends ccf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((sm) obj).b.K0.setVisibility(0);
                return;
            case 1:
                dn dnVar = (dn) obj;
                dnVar.K0.setVisibility(0);
                if (dnVar.K0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = eaf.a;
                    r9f.c((View) dnVar.K0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                sm smVar = (sm) obj;
                smVar.b.K0.setAlpha(1.0f);
                dn dnVar = smVar.b;
                dnVar.N0.d((bcf) null);
                dnVar.N0 = null;
                return;
            case 1:
                dn dnVar2 = (dn) obj;
                dnVar2.K0.setAlpha(1.0f);
                dnVar2.N0.d((bcf) null);
                dnVar2.N0 = null;
                return;
            default:
                b2b b2b = (b2b) obj;
                ((dn) b2b.c).K0.setVisibility(8);
                dn dnVar3 = (dn) b2b.c;
                PopupWindow popupWindow = dnVar3.L0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dnVar3.K0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = eaf.a;
                    r9f.c((View) dnVar3.K0.getParent());
                }
                dnVar3.K0.e();
                dnVar3.N0.d((bcf) null);
                dnVar3.N0 = null;
                ViewGroup viewGroup = dnVar3.P0;
                WeakHashMap weakHashMap2 = eaf.a;
                r9f.c(viewGroup);
                return;
        }
    }
}
