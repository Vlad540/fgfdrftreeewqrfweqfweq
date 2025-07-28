package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: wua  reason: default package */
public final class wua extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wua(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                wua wua = new wua(3, (Continuation) obj3, 0);
                wua.Z = (pue) obj;
                wua.Y = (pda) obj2;
                jue jue = jue.a;
                wua.o(jue);
                return jue;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                wua wua2 = new wua((Object) (ShapeDrawable) this.Z, (Continuation) obj3, 1);
                wua2.Y = (pda) obj2;
                jue jue2 = jue.a;
                wua2.o(jue2);
                return jue2;
            case 2:
                wua wua3 = new wua(3, (Continuation) obj3, 2);
                wua3.Z = (le1) obj;
                wua3.Y = (bka) obj2;
                return wua3.o(jue.a);
            case 3:
                pda pda = (pda) obj2;
                wua wua4 = new wua((a1b) this.Y, (Continuation) obj3, 3, false);
                wua4.Z = (ImageView) obj;
                jue jue3 = jue.a;
                wua4.o(jue3);
                return jue3;
            case 4:
                pda pda2 = (pda) obj2;
                wua wua5 = new wua((a1b) this.Y, (Continuation) obj3, 4, false);
                wua5.Z = (AppCompatTextView) obj;
                jue jue4 = jue.a;
                wua5.o(jue4);
                return jue4;
            case 5:
                pda pda3 = (pda) obj2;
                wua wua6 = new wua((Context) this.Y, (Continuation) obj3, 5, false);
                wua6.Z = (b1b) obj;
                jue jue5 = jue.a;
                wua6.o(jue5);
                return jue5;
            case 6:
                pda pda4 = (pda) obj2;
                wua wua7 = new wua((rzb) this.Y, (Continuation) obj3, 6, false);
                wua7.Z = (RecyclerView) obj;
                jue jue6 = jue.a;
                wua7.o(jue6);
                return jue6;
            case 7:
                wua wua8 = new wua(3, (Continuation) obj3, 7);
                wua8.Z = (x1c) obj;
                wua8.Y = (pda) obj2;
                jue jue7 = jue.a;
                wua8.o(jue7);
                return jue7;
            case 8:
                pda pda5 = (pda) obj2;
                wua wua9 = new wua((RecordControlsWidget) this.Y, (Continuation) obj3, 8, false);
                wua9.Z = (ImageView) obj;
                jue jue8 = jue.a;
                wua9.o(jue8);
                return jue8;
            case 9:
                pda pda6 = (pda) obj2;
                wua wua10 = new wua((RecordControlsWidget) this.Y, (Continuation) obj3, 9, false);
                wua10.Z = (TextView) obj;
                jue jue9 = jue.a;
                wua10.o(jue9);
                return jue9;
            case 10:
                pda pda7 = (pda) obj2;
                wua wua11 = new wua((View) this.Y, (Continuation) obj3, 10, false);
                wua11.Z = (View) obj;
                jue jue10 = jue.a;
                wua11.o(jue10);
                return jue10;
            case 11:
                pda pda8 = (pda) obj2;
                wua wua12 = new wua((SearchMessageBottomWidget) this.Y, (Continuation) obj3, 11, false);
                wua12.Z = (ConstraintLayout) obj;
                jue jue11 = jue.a;
                wua12.o(jue11);
                return jue11;
            case Protos.Attaches.Attach.PRESENT:
                wua wua13 = new wua(3, (Continuation) obj3, 12);
                wua13.Z = (List) obj;
                wua13.Y = (o46) obj2;
                return wua13.o(jue.a);
            case 13:
                wua wua14 = new wua(3, (Continuation) obj3, 13);
                wua14.Z = (gwc) obj;
                wua14.Y = (pda) obj2;
                jue jue12 = jue.a;
                wua14.o(jue12);
                return jue12;
            case Protos.Attaches.Attach.LOCATION:
                pda pda9 = (pda) obj2;
                wua wua15 = new wua((dwc) this.Y, (Continuation) obj3, 14, false);
                wua15.Z = (ConstraintLayout) obj;
                jue jue13 = jue.a;
                wua15.o(jue13);
                return jue13;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                wua wua16 = new wua((Object) (rdd) this.Z, (Continuation) obj3, 15);
                wua16.Y = (pda) obj2;
                jue jue14 = jue.a;
                wua16.o(jue14);
                return jue14;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                wua wua17 = new wua(3, (Continuation) obj3, 16);
                wua17.Z = (AppCompatImageView) obj;
                wua17.Y = (pda) obj2;
                jue jue15 = jue.a;
                wua17.o(jue15);
                return jue15;
            case LangUtils.HASH_SEED:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) obj;
                pda pda10 = (pda) obj2;
                wua wua18 = new wua((sud) this.Z, (Context) this.Y, (Continuation) obj3);
                jue jue16 = jue.a;
                wua18.o(jue16);
                return jue16;
            case 18:
                View view = (View) obj;
                wua wua19 = new wua((Object) (SuggestionsWidget) this.Z, (Continuation) obj3, 18);
                wua19.Y = (pda) obj2;
                jue jue17 = jue.a;
                wua19.o(jue17);
                return jue17;
            case 19:
                pda pda11 = (pda) obj2;
                wua wua20 = new wua((View) this.Y, (Continuation) obj3, 19, false);
                wua20.Z = (ImageView) obj;
                jue jue18 = jue.a;
                wua20.o(jue18);
                return jue18;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                rj5 rj5 = (rj5) obj;
                wua wua21 = new wua((UploadFileAttachWorker) this.Y, (Continuation) obj3, 20, false);
                wua21.Z = (Throwable) obj2;
                jue jue19 = jue.a;
                wua21.o(jue19);
                return jue19;
            default:
                pda pda12 = (pda) obj2;
                wua wua22 = new wua((VideoMessageWidget) this.Y, (Continuation) obj3, 21, false);
                wua22.Z = (TextView) obj;
                jue jue20 = jue.a;
                wua22.o(jue20);
                return jue20;
        }
    }

    /* JADX WARNING: type inference failed for: r5v53, types: [gwc, android.view.View] */
    public final Object o(Object obj) {
        qja qja;
        int i;
        int i2;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                int i3 = ((pda) this.Y).c().a.c;
                ((pue) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, new ColorDrawable(-65536)));
                return jue.a;
            case 1:
                wx3.H(obj);
                ((ShapeDrawable) this.Z).getPaint().setColor(((pda) this.Y).h().j);
                return jue.a;
            case 2:
                wx3.H(obj);
                le1 le1 = (le1) this.Z;
                bka bka = (bka) this.Y;
                int size = bka.c.size();
                Map map = bka.c;
                qja qja2 = bka.a;
                if (size > 1) {
                    if (le1 == null && (le1 = bka.d) == null) {
                        le1 = bka.e;
                    }
                    qja = (qja) map.get(le1);
                    if (qja == null) {
                        return qja2;
                    }
                } else {
                    qja = (qja) o23.W(map.values());
                    if (qja == null) {
                        return qja2;
                    }
                    if (!qja.a.l() && qja2.a.a()) {
                        return qja2;
                    }
                }
                return qja;
            case 3:
                wx3.H(obj);
                ImageView imageView = (ImageView) this.Z;
                a1b a1b = (a1b) this.Y;
                Integer num = a1b.b;
                if (num != null) {
                    i = a1b.getCurrentTheme().i(num.intValue());
                } else {
                    i = a1b.getCurrentTheme().getIcon().f;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return jue.a;
            case 4:
                wx3.H(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.Z;
                a1b a1b2 = (a1b) this.Y;
                Integer num2 = a1b2.b;
                if (num2 != null) {
                    i2 = a1b2.getCurrentTheme().i(num2.intValue());
                } else {
                    i2 = a1b2.getCurrentTheme().getText().e;
                }
                appCompatTextView.setTextColor(i2);
                return jue.a;
            case 5:
                wx3.H(obj);
                b1b b1b = (b1b) this.Z;
                b1b.setBackground(new ColorDrawable(b1b.getCurrentTheme().b().f));
                km4.d(km4.y0.n((Context) this.Y), b1b);
                return jue.a;
            case 6:
                wx3.H(obj);
                ((RecyclerView) this.Z).setBackground(swb.M(Integer.valueOf(km4.y0.n(((rzb) this.Y).a).g().b().f), (Integer) null, (Integer) null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                return jue.a;
            case 7:
                wx3.H(obj);
                ((x1c) this.Z).a2.setColor(((pda) this.Y).h().k);
                return jue.a;
            case 8:
                wx3.H(obj);
                ImageView imageView2 = (ImageView) this.Z;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.Y;
                s59 s59 = km4.y0;
                s59.r(imageView2);
                js.D((Drawable) recordControlsWidget.R0.getValue(), -1);
                js.D(recordControlsWidget.D0(), s59.r(imageView2).a().o().e.g);
                return jue.a;
            case 9:
                wx3.H(obj);
                TextView textView = (TextView) this.Z;
                s59 s592 = km4.y0;
                textView.setTextColor(s592.r(textView).getText().f);
                k77[] k77Arr = RecordControlsWidget.m1;
                js.D((InsetDrawable) ((RecordControlsWidget) this.Y).S0.getValue(), s592.r(textView).getIcon().i);
                return jue.a;
            case 10:
                wx3.H(obj);
                View view = (View) this.Z;
                s59 s593 = km4.y0;
                ((View) this.Y).setBackgroundColor(s593.r(view).b().i);
                ((TextView) view.findViewById(mqb.oneme_settings_privacy_onboarding_content_title)).setTextColor(s593.r(view).getText().e);
                return jue.a;
            case 11:
                wx3.H(obj);
                k77[] k77Arr2 = SearchMessageBottomWidget.w0;
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.Y;
                ((ConstraintLayout) this.Z).setBackgroundColor(searchMessageBottomWidget.r0().a.a);
                searchMessageBottomWidget.m0().setTextColor(searchMessageBottomWidget.r0().b.b);
                searchMessageBottomWidget.n0().setBackgroundColor(searchMessageBottomWidget.r0().c.d);
                searchMessageBottomWidget.q0(searchMessageBottomWidget.o0(), searchMessageBottomWidget.Y);
                searchMessageBottomWidget.q0(searchMessageBottomWidget.l0(), searchMessageBottomWidget.Z);
                return jue.a;
            case Protos.Attaches.Attach.PRESENT:
                wx3.H(obj);
                return new wia((List) this.Z, (o46) this.Y);
            case 13:
                wx3.H(obj);
                ((gwc) this.Z).setBackgroundColor(((pda) this.Y).b().k);
                return jue.a;
            case Protos.Attaches.Attach.LOCATION:
                wx3.H(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.Z;
                dwc dwc = (dwc) this.Y;
                ImageView imageView3 = dwc.J0;
                s59 s594 = km4.y0;
                s594.r(constraintLayout);
                imageView3.setColorFilter(-16745729);
                dwc.K0.setTextColor(s594.r(constraintLayout).getText().e);
                dwc.L0.setTextColor(s594.r(constraintLayout).getText().f);
                return jue.a;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                wx3.H(obj);
                pda pda = (pda) this.Y;
                rdd rdd = (rdd) this.Z;
                rdd.Q0.setBackgroundColor(pda.b().h);
                rdd.K0.setTextColor(pda.getText().e);
                AppCompatEditText appCompatEditText = rdd.L0;
                appCompatEditText.setTextColor(pda.getText().e);
                appCompatEditText.setHintTextColor(pda.getText().h);
                rdd.M0.setTextColor(-16745729);
                rdd.S0.setTextColor(pda.getText().f);
                return jue.a;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                wx3.H(obj);
                ((AppCompatImageView) this.Z).setImageTintList(ColorStateList.valueOf(((pda) this.Y).getIcon().i));
                return jue.a;
            case LangUtils.HASH_SEED:
                wx3.H(obj);
                sud sud = (sud) this.Z;
                js.D(sud.J0, km4.y0.n((Context) this.Y).g().b().a.g);
                ix1 ix1 = sud.P0;
                if (ix1 != null) {
                    if (sud.K0 != null) {
                        sud.K0 = sud.H();
                    }
                    hud hud = ix1.b;
                    sud.F(hud.Y);
                    sud.G(hud.Z);
                }
                return jue.a;
            case 18:
                wx3.H(obj);
                pda pda2 = (pda) this.Y;
                k77[] k77Arr3 = SuggestionsWidget.F0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.Z;
                suggestionsWidget.y0().setTextColor(pda2.getText().g);
                suggestionsWidget.x0().setBackgroundColor(pda2.getIcon().g);
                k77[] k77Arr4 = SuggestionsWidget.F0;
                k77 k77 = k77Arr4[4];
                ((AppCompatImageView) suggestionsWidget.B0.getValue()).setImageTintList(ColorStateList.valueOf(pda2.getIcon().f));
                k77 k772 = k77Arr4[5];
                ((AppCompatTextView) suggestionsWidget.C0.getValue()).setTextColor(pda2.getText().e);
                return jue.a;
            case 19:
                wx3.H(obj);
                ImageView imageView4 = (ImageView) this.Z;
                s59 s595 = km4.y0;
                View view2 = (View) this.Y;
                s595.r(view2);
                imageView4.setColorFilter(-1);
                imageView4.setBackgroundColor(s595.r(view2).b().a.j);
                return jue.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                wx3.H(obj);
                Throwable th = (Throwable) this.Z;
                if (th != null) {
                    UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.Y;
                    uploadFileAttachWorker.e(th);
                    uploadFileAttachWorker.G0 = gh7.a();
                }
                return jue.a;
            default:
                wx3.H(obj);
                TextView textView2 = (TextView) this.Z;
                s59 s596 = km4.y0;
                s596.r(textView2);
                textView2.setTextColor(-1);
                ((GradientDrawable) textView2.getBackground()).setColor(s596.r(textView2).b().a.g);
                k77[] k77Arr5 = VideoMessageWidget.y0;
                js.D((InsetDrawable) ((VideoMessageWidget) this.Y).X.getValue(), s596.r(textView2).e().a);
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wua(sud sud, Context context, Continuation continuation) {
        super(3, continuation);
        this.X = 17;
        this.Z = sud;
        this.Y = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wua(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wua(Object obj, Continuation continuation, int i, boolean z) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
    }
}
