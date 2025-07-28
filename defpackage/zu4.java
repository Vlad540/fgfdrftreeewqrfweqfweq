package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.PickerChatController;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zu4  reason: default package */
public final /* synthetic */ class zu4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zu4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r10v28, types: [x2a, android.view.View] */
    public final Object invoke() {
        String str;
        tt6 tt6;
        String[] names;
        s59 s59 = km4.y0;
        Class<xzc> cls = xzc.class;
        Set set = null;
        jue jue = jue.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                return n1g.a(((pae) ((t97) obj2).getValue()).b().limitedParallelism(2, "emoji_sprite_loader").plus(new qj((bv4) obj)));
            case 1:
                wv4 wv4 = (wv4) obj;
                return new bv4(wv4.d, wv4.a, (t97) obj2);
            case 2:
                Context context = (Context) obj2;
                int i = mze.a;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                String str2 = Build.VERSION.RELEASE;
                StringBuilder sb = new StringBuilder(me4.e(me4.e(47, str), str2));
                sb.append("ExoPlayer/");
                sb.append(str);
                sb.append(" (Linux;Android ");
                sb.append(str2);
                sb.append(") ExoPlayerLib/2.17.1");
                return new i64(context, sb.toString(), (f54) ((f35) obj).b.getValue());
            case 3:
                gv0 gv0 = new gv0();
                gv0.a = (av0) ((t97) obj2).getValue();
                gv0.d = (nz3) ((g35) obj).a.getValue();
                gv0.e = 2;
                return gv0;
            case 4:
                ((u16) obj2).invoke(Long.valueOf(((y75) obj).a));
                return jue;
            case 5:
                u16 u16 = ((a85) obj2).K0;
                if (u16 != null) {
                    u16.invoke(Long.valueOf(((y75) obj).a));
                }
                return jue;
            case 6:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                ((FrameLayout) obj2).removeCallbacks(fakeInAppReviewBottomSheet.J0);
                if (fakeInAppReviewBottomSheet.K0 && (tt6 = (tt6) pt6.a.getAccessor().e()) != null) {
                    tt6.b(4);
                }
                return jue;
            case 7:
                ud5 ud5 = (ud5) obj;
                zd5 zd5 = new zd5((Context) obj2, ud5.c);
                zd5.setCallback(ud5);
                return zd5;
            case 8:
                ue5 ue5 = (ue5) obj2;
                return new ye5(ue5.c, ue5.b, (we5) obj);
            case 9:
                ((qt5) obj2).Y.i.remove((ot5) obj);
                return jue;
            case 10:
                k77[] k77Arr = ForwardPickerScreen.M0;
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj2;
                forwardPickerScreen.u0().c.r.K(4);
                ek8.g((View) obj, ForwardPickerScreen.N0, (u16) null);
                forwardPickerScreen.x0().setLeftIcon(phc.Z0);
                return jue;
            case 11:
                k77[] k77Arr2 = ForwardPickerScreen.M0;
                ForwardPickerScreen forwardPickerScreen2 = (ForwardPickerScreen) obj2;
                forwardPickerScreen2.u0().c.h(((jq8) obj).getText(), (Set) forwardPickerScreen2.u0().Z.a.getValue(), forwardPickerScreen2.A0());
                return jue;
            case Protos.Attaches.Attach.PRESENT:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r57 r57 = (r57) obj;
                syc syc = (syc) obj2;
                boolean z = r57.a.m && hhd.f(syc.e(), xyc.g);
                bm3.x(r57, syc);
                int f = syc.f();
                for (int i2 = 0; i2 < f; i2++) {
                    List h = syc.h(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : h) {
                        if (next instanceof f67) {
                            arrayList.add(next);
                        }
                    }
                    f67 f67 = (f67) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (!(f67 == null || (names = f67.names()) == null)) {
                        for (String str3 : names) {
                            if (z) {
                                str3 = str3.toLowerCase(Locale.ROOT);
                            }
                            bm3.d(linkedHashMap, syc, str3, i2);
                        }
                    }
                    String lowerCase = z ? syc.g(i2).toLowerCase(Locale.ROOT) : null;
                    if (lowerCase != null) {
                        bm3.d(linkedHashMap, syc, lowerCase, i2);
                    }
                }
                return linkedHashMap.isEmpty() ? iw4.a : linkedHashMap;
            case 13:
                k77[] k77Arr3 = MediaGalleryWidget.Z;
                qj qjVar = new qj(nqc.a.i());
                t97 b2 = rna.a.b();
                e58 e58 = e58.a;
                gl7 gl7 = (gl7) e58.getAccessor().c(gl7.class);
                t97 t97 = mqc.a;
                Class<q46> cls2 = q46.class;
                Object E = ek8.E((Bundle) obj2, "arg_gallery_mode", cls2);
                if (E != null) {
                    MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                    return new m66((q46) ((Parcelable) E), mediaGalleryWidget.getContext(), qjVar, (wk7) e58.getAccessor().c(wk7.class), gl7, b2, e58.getAccessor().d(cls), mediaGalleryWidget.m0());
                }
                throw new IllegalArgumentException(wn6.i("No value passed for key arg_gallery_mode of type ", cls2.getSimpleName(), " in bundle").toString());
            case Protos.Attaches.Attach.LOCATION:
                d87 d87 = (d87) ((z68) obj2).d.invoke();
                if (d87 != null) {
                    d87.N();
                }
                ((s16) obj).invoke();
                return jue;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ImageView imageView = new ImageView((Context) obj2);
                imageView.setId(qhc.T);
                float f2 = (float) 28;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 80;
                jq8 jq8 = (jq8) obj;
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, jq8.a);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(jq8.o);
                imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).a().d().c.c));
                return imageView;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                zz8 zz8 = (zz8) obj;
                return new x99((t97) obj2, zz8.a, zz8.Y, zz8.s1, new zv(2, zz8, zz8.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 28));
            case LangUtils.HASH_SEED:
                bx8.c.getClass();
                taf.o(((zz8) obj2).B1, new a34(":call-join-preview?link=".concat(((je7) ((ne7) obj)).a)));
                return jue;
            case 18:
                return new zb0(((q49) obj).b, (t97) obj2);
            case 19:
                return new vk9((ou3) ((yk9) obj).a.getValue(), (t97) obj2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                wy9 wy9 = (wy9) obj2;
                String str4 = ((OneMeApplication) obj).Y;
                try {
                    joe.a(wy9);
                    udd.q(str4, "Tracer init success!");
                } catch (Throwable th) {
                    udd.s(str4 + "/Tracer", "failed when init", th);
                }
                return jue;
            case 21:
                return new x1a((t97) obj2, ((kd8) obj).o);
            case 22:
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable((Context) obj2, mnb.ic_cancel_filled_24);
                s59.r((x2a) obj);
                xs7.P(enhancedVectorDrawable, "circle_background", -1);
                return enhancedVectorDrawable;
            case 23:
                int i3 = i4a.f;
                ((i4a) obj2).a().e.remove((g4a) obj);
                return jue;
            case 24:
                StringBuilder n = me4.n(mg5.g(((mg5) ((i6a) obj2).b.b.getValue()).c(), "logs").getAbsolutePath(), File.separator);
                n.append(((e6a) obj).a);
                return n.toString();
            case 25:
                iba iba = (iba) ((k40) obj2).Y;
                if (iba != null) {
                    iba.J((jba) obj);
                }
                return jue;
            case 26:
                f4a f4a = new f4a((Context) obj2);
                f4a.setId(qhc.z0);
                int t = hr1.t(((gda) obj).getTabItem().c);
                e4a e4a = e4a.a;
                if (t != 0) {
                    if (t == 1) {
                        e4a = e4a.b;
                    } else if (t != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f4a.setAppearance(e4a);
                return f4a;
            case 27:
                TextView textView = new TextView((Context) obj2);
                nte.o.b(textView, yq4.b);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                float f3 = (float) 12;
                float f4 = (float) 4;
                textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                ((mda) obj).addView(textView);
                return textView;
            case 28:
                ((pea) obj2).a();
                ((s16) obj).invoke();
                return jue;
            default:
                k77[] k77Arr4 = PickerChatController.F0;
                bua bua = new bua();
                PickerChatController pickerChatController = (PickerChatController) obj2;
                Context applicationContext = pickerChatController.getContext().getApplicationContext();
                s16 qga = new qga(4);
                tp2 tp2 = tp2.a;
                qr2 qr2 = new qr2(applicationContext, qga, tp2.getAccessor().d(f03.class), tp2.getAccessor().d(cls), tp2.getAccessor().d(jb5.class), tp2.getAccessor().d(q2b.class), tp2.getAccessor().d(ho2.class), tp2.getAccessor().d(go2.class));
                Bundle bundle = (Bundle) obj;
                Intent intent = (Intent) bundle.getParcelable("ru.ok.tamtam.extra.DATA");
                b9 s = intent != null ? new ydc((Context) tp2.getAccessor().c(Context.class), (g15) tp2.getAccessor().c(g15.class), (bf5) tp2.getAccessor().c(bf5.class), 14).s(intent) : null;
                long[] longArray = bundle.getLongArray("ru.ok.tamtam.extra.MESSAGES");
                if (longArray != null) {
                    set = cs.h0(longArray);
                }
                Set set2 = set == null ? qw4.a : set;
                k77 k77 = PickerChatController.F0[1];
                Set h0 = cs.h0((long[]) pickerChatController.c.a(pickerChatController));
                r7e d = tp2.getAccessor().d(bv2.class);
                tp2.getAccessor().d(ap3.class);
                return new xra(set2, h0, s, d, tp2.d(), bua, tp2.getAccessor().d(vs7.class), qr2, tp2.getAccessor().d(kbd.class));
        }
    }

    public /* synthetic */ zu4(Object obj, t97 t97, int i) {
        this.a = i;
        this.c = obj;
        this.b = t97;
    }
}
