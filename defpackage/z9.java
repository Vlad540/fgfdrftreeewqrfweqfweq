package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z9  reason: default package */
public final class z9 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                z9 z9Var = new z9(3, (Continuation) obj3, 0);
                z9Var.Z = (AppCompatEditText) obj;
                z9Var.Y = (pda) obj2;
                jue jue = jue.a;
                z9Var.o(jue);
                return jue;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                z9 z9Var2 = new z9((Object) (BaseBottomSheetWidget) this.Z, (Continuation) obj3, 1);
                z9Var2.Y = (pda) obj2;
                jue jue2 = jue.a;
                z9Var2.o(jue2);
                return jue2;
            case 2:
                z9 z9Var3 = new z9(3, (Continuation) obj3, 2);
                z9Var3.Z = (Long) obj;
                z9Var3.Y = (zw3) obj2;
                return z9Var3.o(jue.a);
            case 3:
                LinearLayout linearLayout = (LinearLayout) obj;
                z9 z9Var4 = new z9((Object) (ri2) this.Z, (Continuation) obj3, 3);
                z9Var4.Y = (pda) obj2;
                jue jue3 = jue.a;
                z9Var4.o(jue3);
                return jue3;
            case 4:
                z9 z9Var5 = new z9(3, (Continuation) obj3, 4);
                z9Var5.Z = (hp2) obj;
                z9Var5.Y = (yrc) obj2;
                return z9Var5.o(jue.a);
            case 5:
                z9 z9Var6 = new z9(3, (Continuation) obj3, 5);
                z9Var6.Z = (xe4) obj;
                z9Var6.Y = (pda) obj2;
                jue jue4 = jue.a;
                z9Var6.o(jue4);
                return jue4;
            case 6:
                rj5 rj5 = (rj5) obj;
                z9 z9Var7 = new z9((Object) (bt2) this.Y, (Continuation) obj3, 6, false);
                z9Var7.Z = (Throwable) obj2;
                jue jue5 = jue.a;
                z9Var7.o(jue5);
                return jue5;
            case 7:
                z9 z9Var8 = new z9(3, (Continuation) obj3, 7);
                z9Var8.Z = (hq2) obj;
                z9Var8.Y = (List) obj2;
                return z9Var8.o(jue.a);
            case 8:
                pda pda = (pda) obj2;
                z9 z9Var9 = new z9((Object) (pq3) this.Y, (Continuation) obj3, 8, false);
                z9Var9.Z = (TextView) obj;
                jue jue6 = jue.a;
                z9Var9.o(jue6);
                return jue6;
            case 9:
                z9 z9Var10 = new z9(3, (Continuation) obj3, 9);
                z9Var10.Z = (jx3) obj;
                z9Var10.Y = (pda) obj2;
                jue jue7 = jue.a;
                z9Var10.o(jue7);
                return jue7;
            case 10:
                z9 z9Var11 = new z9(3, (Continuation) obj3, 10);
                z9Var11.Z = (x7b) obj;
                z9Var11.Y = (List) obj2;
                return z9Var11.o(jue.a);
            case 11:
                ViewGroup viewGroup = (ViewGroup) obj;
                pda pda2 = (pda) obj2;
                z9 z9Var12 = new z9((chd) (ev4) this.Z, (Object) (Context) this.Y, (Continuation) obj3, 11);
                jue jue8 = jue.a;
                z9Var12.o(jue8);
                return jue8;
            case Protos.Attaches.Attach.PRESENT:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                z9 z9Var13 = new z9((Object) (uh5) this.Z, (Continuation) obj3, 12);
                z9Var13.Y = (pda) obj2;
                jue jue9 = jue.a;
                z9Var13.o(jue9);
                return jue9;
            case 13:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                z9 z9Var14 = new z9((Object) (xp5) this.Z, (Continuation) obj3, 13);
                z9Var14.Y = (pda) obj2;
                jue jue10 = jue.a;
                z9Var14.o(jue10);
                return jue10;
            case Protos.Attaches.Attach.LOCATION:
                z9 z9Var15 = new z9(3, (Continuation) obj3, 14);
                z9Var15.Z = (ConstraintLayout) obj;
                z9Var15.Y = (pda) obj2;
                jue jue11 = jue.a;
                z9Var15.o(jue11);
                return jue11;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                z9 z9Var16 = new z9(3, (Continuation) obj3, 15);
                z9Var16.Z = (flb) obj;
                z9Var16.Y = (pda) obj2;
                jue jue12 = jue.a;
                z9Var16.o(jue12);
                return jue12;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                z9 z9Var17 = new z9((Object) (InviteByQrBottomSheet) this.Z, (Continuation) obj3, 16);
                z9Var17.Y = (pda) obj2;
                jue jue13 = jue.a;
                z9Var17.o(jue13);
                return jue13;
            case LangUtils.HASH_SEED:
                LinearLayout linearLayout4 = (LinearLayout) obj;
                z9 z9Var18 = new z9((Object) (k97) this.Z, (Continuation) obj3, 17);
                z9Var18.Y = (pda) obj2;
                jue jue14 = jue.a;
                z9Var18.o(jue14);
                return jue14;
            case 18:
                z9 z9Var19 = new z9(3, (Continuation) obj3, 18);
                z9Var19.Z = (fb7) obj;
                z9Var19.Y = (pda) obj2;
                jue jue15 = jue.a;
                z9Var19.o(jue15);
                return jue15;
            case 19:
                z9 z9Var20 = new z9(3, (Continuation) obj3, 19);
                z9Var20.Z = (Long) obj;
                z9Var20.Y = (String) obj2;
                return z9Var20.o(jue.a);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                z9 z9Var21 = new z9((Object) (GradientDrawable) this.Z, (Continuation) obj3, 20);
                z9Var21.Y = (pda) obj2;
                jue jue16 = jue.a;
                z9Var21.o(jue16);
                return jue16;
            case 21:
                View view = (View) obj;
                pda pda3 = (pda) obj2;
                z9 z9Var22 = new z9((chd) (gt8) this.Z, (Object) (View) this.Y, (Continuation) obj3, 21);
                jue jue17 = jue.a;
                z9Var22.o(jue17);
                return jue17;
            case 22:
                z9 z9Var23 = new z9(3, (Continuation) obj3, 22);
                z9Var23.Z = (i22) obj;
                z9Var23.Y = (tw8) obj2;
                return z9Var23.o(jue.a);
            case 23:
                pda pda4 = (pda) obj2;
                z9 z9Var24 = new z9((Object) (MessagesListWidget) this.Y, (Continuation) obj3, 23, false);
                z9Var24.Z = (EndlessRecyclerView2) obj;
                jue jue18 = jue.a;
                z9Var24.o(jue18);
                return jue18;
            case 24:
                z9 z9Var25 = new z9(3, (Continuation) obj3, 24);
                z9Var25.Z = (add) obj;
                z9Var25.Y = (pda) obj2;
                jue jue19 = jue.a;
                z9Var25.o(jue19);
                return jue19;
            case 25:
                z9 z9Var26 = new z9(3, (Continuation) obj3, 25);
                z9Var26.Z = (jwc) obj;
                z9Var26.Y = (fxa) obj2;
                return z9Var26.o(jue.a);
            case 26:
                pda pda5 = (pda) obj2;
                z9 z9Var27 = new z9((Object) (Context) this.Y, (Continuation) obj3, 26, false);
                z9Var27.Z = (p4a) obj;
                jue jue20 = jue.a;
                z9Var27.o(jue20);
                return jue20;
            case 27:
                z9 z9Var28 = new z9(3, (Continuation) obj3, 27);
                z9Var28.Z = (aba) obj;
                z9Var28.Y = (pda) obj2;
                jue jue21 = jue.a;
                z9Var28.o(jue21);
                return jue21;
            case 28:
                z9 z9Var29 = new z9(3, (Continuation) obj3, 28);
                z9Var29.Z = (y49) obj;
                z9Var29.Y = (pda) obj2;
                jue jue22 = jue.a;
                z9Var29.o(jue22);
                return jue22;
            default:
                z9 z9Var30 = new z9(3, (Continuation) obj3, 29);
                z9Var30.Z = (c8a) obj;
                z9Var30.Y = (pda) obj2;
                jue jue23 = jue.a;
                z9Var30.o(jue23);
                return jue23;
        }
    }

    /* JADX WARNING: type inference failed for: r6v70, types: [p4a, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r6v74, types: [android.view.View, y49] */
    public final Object o(Object obj) {
        int i;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                AppCompatEditText appCompatEditText = (AppCompatEditText) this.Z;
                pda pda = (pda) this.Y;
                appCompatEditText.setTextColor(pda.getText().e);
                appCompatEditText.setBackgroundColor(pda.b().j);
                return jue.a;
            case 1:
                wx3.H(obj);
                pda pda2 = (pda) this.Y;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.Z;
                pda p0 = baseBottomSheetWidget.p0();
                if (p0 != null) {
                    pda2 = p0;
                }
                baseBottomSheetWidget.o0().setBackground(new ColorDrawable(pda2.b().f));
                return jue.a;
            case 2:
                wx3.H(obj);
                Long l = (Long) this.Z;
                if (((zw3) this.Y).j instanceof z55) {
                    return null;
                }
                return l;
            case 3:
                wx3.H(obj);
                pda pda3 = (pda) this.Y;
                ri2 ri2 = (ri2) this.Z;
                ri2.J0.onThemeChanged(pda3);
                t97 t97 = ri2.K0;
                if (t97.a()) {
                    ((TextView) t97.getValue()).setTextColor(pda3.getText().b);
                }
                return jue.a;
            case 4:
                wx3.H(obj);
                return new wia((hp2) this.Z, (yrc) this.Y);
            case 5:
                wx3.H(obj);
                ((xe4) this.Z).onThemeChanged((pda) this.Y);
                return jue.a;
            case 6:
                wx3.H(obj);
                Throwable th = (Throwable) this.Z;
                if (!(th instanceof CancellationException)) {
                    udd.s(((bt2) this.Y).N0, "observeChatsAndPresences fail", th);
                }
                return jue.a;
            case 7:
                wx3.H(obj);
                return new wia((hq2) this.Z, (List) this.Y);
            case 8:
                wx3.H(obj);
                TextView textView = (TextView) this.Z;
                Integer num = ((pq3) this.Y).c;
                s59 s59 = km4.y0;
                if (num != null) {
                    i = s59.r(textView).i(num.intValue());
                } else {
                    i = s59.r(textView).getText().e;
                }
                textView.setTextColor(i);
                return jue.a;
            case 9:
                wx3.H(obj);
                jx3 jx3 = (jx3) this.Z;
                pda pda4 = (pda) this.Y;
                jx3.b.setTextColor(pda4.getText().e);
                EditText editText = jx3.b;
                editText.setHintTextColor(pda4.getText().h);
                editText.setBackground((Drawable) null);
                jx3.c.setTextColor(pda4.getText().f);
                jx3.setBackgroundColor(pda4.b().a.h);
                return jue.a;
            case 10:
                wx3.H(obj);
                return new as4((x7b) this.Z, (List) this.Y);
            case 11:
                wx3.H(obj);
                ev4 ev4 = (ev4) this.Z;
                js.D(ev4.J0, km4.y0.n((Context) this.Y).g().b().a.g);
                hx1 hx1 = ev4.N0;
                if (hx1 != null) {
                    ev4.F(hx1.c);
                }
                return jue.a;
            case Protos.Attaches.Attach.PRESENT:
                wx3.H(obj);
                pda pda5 = (pda) this.Y;
                uh5 uh5 = (uh5) this.Z;
                AppCompatEditText appCompatEditText2 = uh5.J0;
                appCompatEditText2.setTextColor(pda5.getText().e);
                appCompatEditText2.setHintTextColor(pda5.getText().h);
                appCompatEditText2.setBackgroundColor(pda5.b().f);
                t97 t972 = uh5.K0;
                if (t972.a()) {
                    ((AppCompatTextView) t972.getValue()).setTextColor(pda5.getText().b);
                }
                return jue.a;
            case 13:
                wx3.H(obj);
                ((xp5) this.Z).J0.onThemeChanged((pda) this.Y);
                return jue.a;
            case Protos.Attaches.Attach.LOCATION:
                wx3.H(obj);
                ((ConstraintLayout) this.Z).setBackgroundColor(((pda) this.Y).b().i);
                return jue.a;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                wx3.H(obj);
                flb flb = (flb) this.Z;
                flb.setBackgroundColor(km4.y0.r(flb).a().d().a.a);
                flb.onThemeChanged((pda) this.Y);
                return jue.a;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                wx3.H(obj);
                pda pda6 = (pda) this.Y;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.Z;
                InviteByQrBottomSheet.z0(inviteByQrBottomSheet).setTextColor(pda6.getText().e);
                InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setTextColor(pda6.getText().f);
                return jue.a;
            case LangUtils.HASH_SEED:
                wx3.H(obj);
                pda pda7 = (pda) this.Y;
                k97 k97 = (k97) this.Z;
                AppCompatEditText appCompatEditText3 = k97.J0;
                appCompatEditText3.setTextColor(pda7.getText().e);
                appCompatEditText3.setHintTextColor(pda7.getText().h);
                appCompatEditText3.setBackgroundColor(pda7.b().f);
                t97 t973 = k97.K0;
                if (t973.a()) {
                    ((AppCompatTextView) t973.getValue()).setTextColor(pda7.getText().b);
                }
                return jue.a;
            case 18:
                wx3.H(obj);
                ((fb7) this.Z).c.setImageTintList(ColorStateList.valueOf(((pda) this.Y).getText().e));
                return jue.a;
            case 19:
                wx3.H(obj);
                Long l2 = (Long) this.Z;
                String str = (String) this.Y;
                if (l2 != null && l2.longValue() == -1) {
                    str = null;
                }
                if (str != null) {
                    return Uri.parse(str);
                }
                return null;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                wx3.H(obj);
                ((pda) this.Y).b();
                js.D((GradientDrawable) this.Z, -1728053248);
                return jue.a;
            case 21:
                wx3.H(obj);
                gt8 gt8 = (gt8) this.Z;
                ht8 ht8 = gt8.L0;
                if (ht8 != null) {
                    boolean b = ir0.b(ht8.a & 2080374784);
                    jo2 a = km4.y0.r((View) this.Y).a();
                    gt8.a(a.a(b));
                    gt8.e(a.o());
                }
                return jue.a;
            case 22:
                wx3.H(obj);
                return new wia((i22) this.Z, (tw8) this.Y);
            case 23:
                wx3.H(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Z;
                ryd ryd = ((MessagesListWidget) this.Y).L0;
                if (ryd != null) {
                    ryd.j();
                }
                endlessRecyclerView2.Y();
                return jue.a;
            case 24:
                wx3.H(obj);
                pda pda8 = (pda) this.Y;
                c9 c9Var = new c9(21);
                wcd wcd = (wcd) c9Var.b;
                wcd.k = false;
                wcd.i = 0.0f;
                c9Var.s(pda8.b().j);
                wcd.d = pda8.b().i;
                c9Var.r();
                c9Var.v(a24.X(((float) 86) * dh4.c().getDisplayMetrics().density));
                ((add) this.Z).a(c9Var.i());
                return jue.a;
            case 25:
                wx3.H(obj);
                return new kwc((jwc) this.Z, (fxa) this.Y);
            case 26:
                wx3.H(obj);
                ? r6 = (p4a) this.Z;
                km4 n = km4.y0.n((Context) this.Y);
                pda w = r6.getCurrentTheme();
                n.getClass();
                km4.c(r6, w);
                return jue.a;
            case 27:
                wx3.H(obj);
                ((pda) this.Y).f().b.getClass();
                ((aba) this.Z).x0 = 687865856;
                return jue.a;
            case 28:
                wx3.H(obj);
                ((y49) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((pda) this.Y).c().a.c), (Drawable) null, new ColorDrawable(-65536)));
                return jue.a;
            default:
                wx3.H(obj);
                ((c8a) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((pda) this.Y).c().a.c), (Drawable) null, new ColorDrawable(-65536)));
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(chd chd, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = chd;
        this.Y = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(Object obj, Continuation continuation, int i, boolean z) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
    }
}
