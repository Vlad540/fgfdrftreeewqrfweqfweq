package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: pq  reason: default package */
public final class pq extends l5e implements k26 {
    public final /* synthetic */ c32 A0;
    public /* synthetic */ LinearLayout X;
    public /* synthetic */ pda Y;
    public final /* synthetic */ AppearanceSettingsScreen Z;
    public final /* synthetic */ TextView w0;
    public final /* synthetic */ TextView x0;
    public final /* synthetic */ TextView y0;
    public final /* synthetic */ ShapeDrawable z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pq(AppearanceSettingsScreen appearanceSettingsScreen, TextView textView, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, c32 c32, Continuation continuation) {
        super(3, continuation);
        this.Z = appearanceSettingsScreen;
        this.w0 = textView;
        this.x0 = textView2;
        this.y0 = textView3;
        this.z0 = shapeDrawable;
        this.A0 = c32;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShapeDrawable shapeDrawable = this.z0;
        c32 c32 = this.A0;
        pq pqVar = new pq(this.Z, this.w0, this.x0, this.y0, shapeDrawable, c32, (Continuation) obj3);
        pqVar.X = (LinearLayout) obj;
        pqVar.Y = (pda) obj2;
        jue jue = jue.a;
        pqVar.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        LinearLayout linearLayout = this.X;
        pda pda = this.Y;
        k77[] k77Arr = AppearanceSettingsScreen.Z;
        AppearanceSettingsScreen appearanceSettingsScreen = this.Z;
        appearanceSettingsScreen.l0().z();
        linearLayout.setBackgroundColor(pda.b().h);
        this.w0.setTextColor(pda.getText().f);
        this.x0.setTextColor(pda.getText().f);
        this.y0.setTextColor(pda.getText().f);
        xs7.E(appearanceSettingsScreen.getViewLifecycleScope(), (hu3) null, (ru3) null, new oq(this.A0, appearanceSettingsScreen, (Continuation) null), 3);
        js.D(this.z0, pda.b().f);
        return jue.a;
    }
}
