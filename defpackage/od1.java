package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.picker.PickerChatController;

/* renamed from: od1  reason: default package */
public final class od1 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ Object x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od1(Object obj, t97 t97, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.x0 = obj;
        this.Y = t97;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                od1 od1 = new od1((Object) (t97) this.Y, (Object) (td1) this.x0, (Continuation) obj3, 0);
                od1.Z = (Long) obj;
                od1.w0 = (CharSequence) obj2;
                jue jue = jue.a;
                od1.o(jue);
                return jue;
            case 1:
                od1 od12 = new od1((Object) (nn2) this.x0, (t97) this.Y, (Continuation) obj3, 1);
                od12.Z = (i22) obj;
                od12.w0 = (tf3) obj2;
                return od12.o(jue.a);
            case 2:
                od1 od13 = new od1((Object) (ImageView) this.Y, (Object) (TextView) this.x0, (Continuation) obj3, 2);
                od13.Z = (LinearLayout) obj;
                od13.w0 = (pda) obj2;
                jue jue2 = jue.a;
                od13.o(jue2);
                return jue2;
            case 3:
                od1 od14 = new od1((Object) (AppCompatImageView) this.Y, (Object) (TextView) this.x0, (Continuation) obj3, 3);
                od14.Z = (FrameLayout) obj;
                od14.w0 = (pda) obj2;
                jue jue3 = jue.a;
                od14.o(jue3);
                return jue3;
            case 4:
                od1 od15 = new od1((Object) (pk8) this.Y, (Object) (String) this.x0, (Continuation) obj3, 4);
                od15.Z = (List) obj;
                od15.w0 = (List) obj2;
                return od15.o(jue.a);
            case 5:
                od1 od16 = new od1((Object) (View) this.Y, (Object) (PickerChatController) this.x0, (Continuation) obj3, 5);
                od16.Z = (Map) obj;
                od16.w0 = (Map) obj2;
                return od16.o(jue.a);
            case 6:
                od1 od17 = new od1((Object) (nwa) this.x0, (t97) this.Y, (Continuation) obj3, 6);
                od17.Z = (qja) obj;
                od17.w0 = (zw3) obj2;
                jue jue4 = jue.a;
                od17.o(jue4);
                return jue4;
            case 7:
                FrameLayout frameLayout = (FrameLayout) obj;
                od1 od18 = new od1((Drawable) this.w0, (Drawable) this.Y, (GradientDrawable) this.x0, (Continuation) obj3, 7);
                od18.Z = (pda) obj2;
                jue jue5 = jue.a;
                od18.o(jue5);
                return jue5;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                od1 od19 = new od1((TextView) this.w0, (TextView) this.Y, (Drawable) this.x0, (Continuation) obj3, 8);
                od19.Z = (pda) obj2;
                jue jue6 = jue.a;
                od19.o(jue6);
                return jue6;
        }
    }

    public final Object o(Object obj) {
        Object value;
        boolean z = false;
        jue jue = jue.a;
        Object obj2 = this.x0;
        Object obj3 = this.Y;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                CharSequence charSequence = (CharSequence) this.w0;
                ((xk1) ((t97) obj3).getValue()).getClass();
                String d = xk1.d((Long) this.Z);
                if (d != null && !h0e.c0(d)) {
                    charSequence = charSequence + " · " + d;
                }
                yk1 yk1 = new yk1(1, BuildConfig.FLAVOR, charSequence);
                al1 al1 = ((td1) obj2).D0;
                al1.b = yk1;
                for (zk1 x : al1.a) {
                    x.x(yk1);
                }
                return jue;
            case 1:
                wx3.H(obj);
                i22 i22 = (i22) this.Z;
                tf3 tf3 = (tf3) this.w0;
                boolean s = tf3 != null ? tf3.s() : i22.E();
                if (!((jb5) ((nn2) obj2).B0.getValue()).s() || !i22.w()) {
                    z = true;
                }
                if (i22.b.J.b(64)) {
                    return un2.Y;
                }
                if (s) {
                    return un2.a;
                }
                if (i22.Q()) {
                    return un2.b;
                }
                if (i22.I()) {
                    return un2.c;
                }
                if (i22.P()) {
                    return un2.o;
                }
                if (i22.T()) {
                    return un2.X;
                }
                t97 t97 = (t97) obj3;
                if (i22.G() && i22.Z() && !i22.v() && z && i22.S((f03) t97.getValue())) {
                    return un2.Z;
                }
                if (i22.G() && i22.Z() && !i22.v() && z && !i22.S((f03) t97.getValue())) {
                    return un2.w0;
                }
                if (!i22.G() || i22.Z()) {
                    return null;
                }
                return un2.x0;
            case 2:
                wx3.H(obj);
                pda pda = (pda) this.w0;
                pda.getIcon();
                ((ImageView) obj3).setColorFilter(-16745729);
                ((TextView) obj2).setTextColor(-16745729);
                ((LinearLayout) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(pda.c().a.f), (Drawable) null, new ColorDrawable(-65536)));
                return jue;
            case 3:
                wx3.H(obj);
                FrameLayout frameLayout = (FrameLayout) this.Z;
                s59 s59 = km4.y0;
                s59.r(frameLayout);
                ((AppCompatImageView) obj3).setImageTintList(ColorStateList.valueOf(-16745729));
                s59.r(frameLayout);
                ((TextView) obj2).setTextColor(-16745729);
                frameLayout.setForeground(new RippleDrawable(ColorStateList.valueOf(((pda) this.w0).c().a.f), (Drawable) null, fp5.J0));
                return jue;
            case 4:
                wx3.H(obj);
                List list = (List) this.Z;
                List list2 = (List) this.w0;
                o23.i0(list, list2);
                pk8 pk8 = (pk8) obj3;
                String str = (String) obj2;
                return o23.i0(pk8.c(pk8, list, str), pk8.c(pk8, list2, str));
            case 5:
                wx3.H(obj);
                Map map = (Map) this.Z;
                Map map2 = (Map) this.w0;
                Iterator it = z3d.F(map2.keySet(), map.keySet()).iterator();
                while (true) {
                    PickerChatController pickerChatController = (PickerChatController) obj2;
                    if (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        k77[] k77Arr = PickerChatController.F0;
                        pickerChatController.l0().c(longValue);
                    } else {
                        cre cre = new cre();
                        k77[] k77Arr2 = PickerChatController.F0;
                        cre.c(pickerChatController.l0());
                        cre.b(f2a.d0);
                        ire.a((ViewGroup) ((View) obj3), cre);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!hhd.f(map.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            long longValue2 = ((Number) entry2.getKey()).longValue();
                            kta kta = (kta) entry2.getValue();
                            pickerChatController.l0().c(longValue2);
                            pickerChatController.l0().a(longValue2, kta.b, kta.e, kta.c, kta.d);
                        }
                        return map2;
                    }
                }
            case 6:
                wx3.H(obj);
                qja qja = (qja) this.Z;
                zw3 zw3 = (zw3) this.w0;
                grd grd = ((nwa) obj2).o;
                do {
                    value = grd.getValue();
                    bga bga = (bga) value;
                } while (!grd.b(value, au7.f(au7.c(qja, qja.a.o(), zw3.h, zw3.f, (xk1) ((t97) obj3).getValue(), zw3.j, (le1) null), false, zw3.h, zw3.f)));
                return jue;
            case 7:
                wx3.H(obj);
                ((pda) this.Z).getIcon();
                ((Drawable) this.w0).setTint(-1);
                ((Drawable) obj3).setTint(-1);
                ((GradientDrawable) obj2).setTint(-1728053248);
                return jue;
            default:
                wx3.H(obj);
                pda pda2 = (pda) this.Z;
                ((TextView) this.w0).setTextColor(pda2.getText().e);
                ((TextView) obj3).setTextColor(pda2.getText().f);
                ((Drawable) obj2).setTint(pda2.getIcon().g);
                return jue;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od1(Object obj, Object obj2, Drawable drawable, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.w0 = obj;
        this.Y = obj2;
        this.x0 = drawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
        this.x0 = obj2;
    }
}
