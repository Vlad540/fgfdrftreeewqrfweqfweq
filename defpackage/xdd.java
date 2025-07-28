package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xdd  reason: default package */
public final class xdd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ydd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdd(ydd ydd, Continuation continuation) {
        super(2, continuation);
        this.Z = ydd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xdd) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xdd xdd = new xdd(this.Z, continuation);
        xdd.Y = obj;
        return xdd;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        ydd ydd = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            if (((zy9) ydd.b.getValue()).d() && n1g.A(ou32)) {
                this.Y = ou32;
                this.X = 1;
                Object f = n1g.f(new vdd(ydd, (Continuation) null), this);
                if (f == pu3) {
                    return pu3;
                }
                ou3 ou33 = ou32;
                obj = f;
                ou3 = ou33;
            }
            return jue;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<sdd> list = (List) obj;
        n1g.k(ou3);
        if (!list.isEmpty()) {
            Context context = ydd.a;
            context.getClass();
            if (Build.VERSION.SDK_INT <= 32) {
                ArrayList arrayList = new ArrayList(list);
                for (sdd sdd : list) {
                    sdd.getClass();
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            for (sdd sdd2 : list) {
                sdd2.getClass();
                ShortcutInfo.Builder intents = new ShortcutInfo.Builder(sdd2.a, sdd2.b).setShortLabel(sdd2.d).setIntents(sdd2.c);
                IconCompat iconCompat = sdd2.f;
                if (iconCompat != null) {
                    intents.setIcon(zn6.d(iconCompat, sdd2.a));
                }
                if (!TextUtils.isEmpty(sdd2.e)) {
                    intents.setLongLabel(sdd2.e);
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    intents.setDisabledMessage((CharSequence) null);
                }
                bs bsVar = sdd2.g;
                if (bsVar != null) {
                    intents.setCategories(bsVar);
                }
                intents.setRank(0);
                int i2 = Build.VERSION.SDK_INT;
                wm7 wm7 = sdd2.h;
                if (wm7 != null) {
                    intents.setLocusId(wm7.b);
                }
                intents.setLongLived(sdd2.i);
                if (i2 >= 33) {
                    br4.c(intents);
                }
                arrayList2.add(intents.build());
            }
            if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
                udd.E(context).getClass();
                udd.E(context).getClass();
                Iterator it = ((ArrayList) udd.D(context)).iterator();
                if (it.hasNext()) {
                    hr1.r(it.next());
                    throw null;
                }
            }
        } else {
            ydd.c();
        }
        return jue;
    }
}
