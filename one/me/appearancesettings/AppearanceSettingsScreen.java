package one.me.appearancesettings;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/AppearanceSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AppearanceSettingsScreen extends Widget {
    public static final /* synthetic */ k77[] Z;
    public final cpf X;
    public final t97 Y;
    public final jj7 a = new jj7((s16) new m(9), (s16) null, 6);
    public final t97 b = createViewModelLazy(dr.class, new s(5, new m(10)));
    public final n0c c = viewBinding(jy9.d);
    public final t97 o;

    static {
        Class<AppearanceSettingsScreen> cls = AppearanceSettingsScreen.class;
        Z = new k77[]{new khb(cls, "chatPreview", "getChatPreview()Lone/me/appearancesettings/view/ChatAppearanceSelectorView;", 0), wn6.e(m7c.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public AppearanceSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        viewBinding(jy9.h);
        hq hqVar = hq.a;
        r7e d = hqVar.getAccessor().d(x4a.class);
        this.o = d;
        this.X = new cpf(new mq(l0()), ((x4a) d.getValue()).a(), 2);
        this.Y = hqVar.getAccessor().d(ip.class);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final dr l0() {
        return (dr) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c32 c32 = new c32(getContext(), ((x4a) this.o.getValue()).a());
        c32.setId(jy9.d);
        c32.setBackgroundSelectedListener(new qq(l0()));
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new rq(c32, this, (Continuation) null), 3);
        nea nea = new nea(getContext(), 6);
        nea.setId(jy9.j);
        nea.setForm(fea.a);
        nea.setTitle(ky9.j);
        nea.setLeftActions(new vda(new l(9, this)));
        TextView textView = new TextView(getContext());
        textView.setId(jy9.i);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        nge nge = nte.t;
        nge.d(nge, textView);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().f);
        textView.setText(d8.u(textView.getContext(), ky9.h));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(jy9.h);
        recyclerView.setLayoutParams(new re3(-1, 0));
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.j(new iq(0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TextView textView2 = new TextView(getContext());
        textView2.setId(jy9.f);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        nge.d(nge, textView2);
        textView2.setTextColor(s59.r(textView2).getText().f);
        textView2.setText(d8.u(textView2.getContext(), ky9.d));
        float[] fArr = new float[8];
        int i = 0;
        for (int i2 = 8; i < i2; i2 = 8) {
            fArr[i] = dh4.c().getDisplayMetrics().density * 16.0f;
            i++;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        js.D(shapeDrawable, s59.n(getContext()).g().b().f);
        eba eba = new eba(getContext());
        eba.setId(jy9.g);
        eba.setLayoutParams(new re3(0, 0));
        eba.setValueFrom(0.0f);
        eba.setValueTo(5.0f);
        eba.setStepSize(1.0f);
        eba.setValue((float) ((ip) this.Y.getValue()).d("app.extra.text.size.mode", 1));
        eba.setBackground(shapeDrawable);
        TextView textView3 = new TextView(getContext());
        textView3.setId(jy9.e);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        nge.d(nte.C, textView3);
        textView3.setTextColor(s59.r(textView3).getText().f);
        textView3.setText(d8.u(textView3.getContext(), ky9.c));
        a24.Z(textView3, 300, new ub(eba, 1, textView3));
        eba.F0.add(new nq(textView3, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 16;
        ShapeDrawable shapeDrawable2 = shapeDrawable;
        constraintLayout.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(layoutParams);
        hq hqVar = hq.a;
        ez3.N(new ck5(ez3.J(new bc((t0c) ((o4a) hqVar.getAccessor().c(o4a.class)).a, 1, this), ((pae) hqVar.getAccessor().d(pae.class).getValue()).a()), new sq(c32, (Continuation) null), 5), getViewLifecycleScope());
        constraintLayout.addView(c32);
        constraintLayout.addView(textView);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(textView3);
        constraintLayout.addView(eba);
        bf3 p = a06.p(constraintLayout);
        int id = c32.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        int id2 = textView.getId();
        p.d(id2, 3, c32.getId(), 4);
        float f3 = (float) 24;
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
        p.d(id2, 6, 0, 6);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id3 = recyclerView.getId();
        p.d(id3, 3, textView.getId(), 4);
        float f4 = (float) 6;
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        int id4 = textView2.getId();
        p.d(id4, 3, recyclerView.getId(), 4);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 6, 0, 6);
        new hw9(p, 6, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id5 = textView3.getId();
        p.d(id5, 3, recyclerView.getId(), 4);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id5, 4));
        p.d(id5, 7, 0, 7);
        new hw9(p, 7, id5, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        int id6 = eba.getId();
        p.d(id6, 3, textView2.getId(), 4);
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id6, 4));
        p.d(id6, 6, 0, 6);
        p.d(id6, 7, 0, 7);
        p.a(constraintLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        ek8.h(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(nea);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        urd.B(new pq(this, textView, textView2, textView3, shapeDrawable2, c32, (Continuation) null), linearLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [i26, l5e] */
    public final void onViewCreated(View view) {
        e07.B(new ck5(l0().J0, new uq(this, (Continuation) null), 5), getViewLifecycleScope());
        e07.B(new ck5(l0().M0, new vq(this, (Continuation) null), 5), getViewLifecycleScope());
        e07.B(new ck5(l0().K0, new l5e(2, (Continuation) null), 5), getViewLifecycleScope());
        l0().z();
    }
}
