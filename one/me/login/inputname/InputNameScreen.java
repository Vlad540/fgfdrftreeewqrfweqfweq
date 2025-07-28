package one.me.login.inputname;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lzma;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "token", "phone", "Ly2b;", "presetAvatars", "(Ljava/lang/String;Ljava/lang/String;Ly2b;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class InputNameScreen extends Widget implements zma, lc3 {
    public static final /* synthetic */ k77[] F0;
    public final n0c A0;
    public final n0c B0;
    public final n0c C0;
    public final jr D0;
    public final jr E0;
    public final sy6 X;
    public final t97 Y;
    public final t97 Z;
    public final /* synthetic */ lu7 a;
    public final jr b;
    public final jr c;
    public final jj7 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<InputNameScreen> cls = InputNameScreen.class;
        F0 = new k77[]{new khb(cls, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), m4b.g(m7c.a, cls, "phone", "getPhone()Ljava/lang/String;", 0), new khb(cls, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new khb(cls, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new khb(cls, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new hc9(cls, "nameText", "getNameText()Ljava/lang/String;"), new hc9(cls, "surnameText", "getSurnameText()Ljava/lang/String;")};
    }

    public InputNameScreen(String str, String str2, y2b y2b) {
        this(jjd.j(new wia[]{new wia("screen:input_name:token", str), new wia("screen:input_name:phone", str2), new wia("screen:input_name:avatars", y2b)}));
    }

    public final void X(boolean z) {
        ((hp7) this.y0.getValue()).b.m((Object) null, Boolean.FALSE);
    }

    public final sy6 getInsetsConfig() {
        return this.X;
    }

    public final rnc getScreenDelegate() {
        return this.o;
    }

    public final void i(int i, Bundle bundle) {
        Object obj;
        rr3 rr3;
        if (i == jpb.oneme_login_input_name_confirmation_return) {
            sz6 sz6 = (sz6) this.w0.getValue();
            sz6.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen:input_phone:phone", "");
            sgc sgc = sz6.a;
            ArrayList e = sgc.e();
            HashSet hashSet = new HashSet();
            zcc it = new adc(sgc.e()).iterator();
            while (true) {
                ListIterator listIterator = it.b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                vgc vgc = (vgc) listIterator.previous();
                if (hhd.f(vgc.b, "InputPhoneScreen")) {
                    break;
                }
                hashSet.add(vgc);
            }
            ListIterator listIterator2 = e.listIterator(e.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator2.previous();
                if (hhd.f(((vgc) obj).b, "InputPhoneScreen")) {
                    break;
                }
            }
            vgc vgc2 = (vgc) obj;
            if (vgc2 != null && (rr3 = vgc2.a) != null) {
                rr3.getArgs().clear();
                rr3.getArgs().putAll(bundle2);
                e.removeAll(hashSet);
                sgc.P(e, (wr3) null);
            }
        }
    }

    public final nf l0() {
        return (nf) this.C0.T0(this, F0[4]);
    }

    public final mda m0() {
        return (mda) this.A0.T0(this, F0[2]);
    }

    public final mda n0() {
        return (mda) this.B0.T0(this, F0[3]);
    }

    public final String o0() {
        k77 k77 = F0[6];
        return (String) this.E0.a(this);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [android.widget.FrameLayout, nf, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new re3(-1, -1));
        nea nea = new nea(constraintLayout.getContext(), 6);
        nea.setId(jpb.oneme_login_input_name_toolbar);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new mx6(this, 0)));
        constraintLayout.addView(nea);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(jpb.oneme_login_input_name_title);
        textView.setLayoutParams(new re3(-1, -2));
        textView.setGravity(17);
        nte.c.b(textView, yq4.b);
        urd.B(new y9(3, (Continuation) null, 12), textView);
        textView.setText(d8.u(getContext(), utb.oneme_login_input_name_title));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(jpb.oneme_login_input_name_description);
        textView2.setLayoutParams(new re3(-1, -2));
        textView2.setGravity(17);
        nte.l.b(textView2, yq4.b);
        urd.B(new y9(3, (Continuation) null, 13), textView2);
        textView2.setText(d8.u(getContext(), utb.oneme_login_input_name_description));
        constraintLayout.addView(textView2);
        mda mda = new mda(constraintLayout.getContext());
        mda.setId(jpb.oneme_login_input_name);
        mda.setLayoutParams(new re3(-1, -2));
        float f = (float) 76;
        mda.setMinimumHeight(a24.X(dh4.c().getDisplayMetrics().density * f));
        mda.setHint(d8.u(getContext(), utb.oneme_login_input_name_hint_name));
        k77 k77 = F0[5];
        mda.setText((String) this.D0.a(this));
        mda.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        int i = j9a.a;
        mda.setBackgroundColorAttr(Integer.valueOf(i));
        urd.B(new to2(3, (Continuation) null, 1), mda);
        constraintLayout.addView(mda);
        mda mda2 = new mda(constraintLayout.getContext());
        mda2.setId(jpb.oneme_login_input_surname);
        mda2.setLayoutParams(new re3(-1, -2));
        mda2.setBackgroundColorAttr(Integer.valueOf(i));
        mda2.setMinimumHeight(a24.X(f * dh4.c().getDisplayMetrics().density));
        mda2.setHint(d8.u(getContext(), utb.oneme_login_input_name_hint_surname));
        mda2.setText(o0());
        mda2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        urd.B(new to2(3, (Continuation) null, 2), mda2);
        constraintLayout.addView(mda2);
        ? frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setClipToOutline(true);
        frameLayout.setId(jpb.oneme_login_input_name_btn_container);
        frameLayout.setLayoutParams(new re3(-1, -2));
        frameLayout.setupDisabledButton(new t13(26));
        frameLayout.setupActiveButton(new t13(27));
        constraintLayout.addView(frameLayout);
        bf3 p = a06.p(constraintLayout);
        int i2 = jpb.oneme_login_input_name_toolbar;
        p.d(i2, 6, 0, 6);
        p.d(i2, 3, 0, 3);
        p.d(i2, 7, 0, 7);
        int i3 = jpb.oneme_login_input_name_title;
        p.d(i3, 6, 0, 6);
        float f2 = (float) 12;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, i3, 4));
        p.d(i3, 3, jpb.oneme_login_input_name_toolbar, 4);
        float f3 = (float) 24;
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, i3, 4));
        p.d(i3, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, i3, 4));
        int i4 = jpb.oneme_login_input_name_description;
        p.d(i4, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, i4, 4));
        p.d(i4, 3, jpb.oneme_login_input_name_title, 4);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, i4, 4));
        p.d(i4, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, i4, 4));
        int i5 = jpb.oneme_login_input_name;
        p.d(i5, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, i5, 4));
        p.d(i5, 3, jpb.oneme_login_input_name_description, 4);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, i5, 4));
        p.d(i5, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, i5, 4));
        int i6 = jpb.oneme_login_input_surname;
        p.d(i6, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, i6, 4));
        p.d(i6, 3, jpb.oneme_login_input_name, 4);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 3, i6, 4));
        p.d(i6, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, i6, 4));
        int i7 = jpb.oneme_login_input_name_btn_container;
        p.d(i7, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, i7, 4));
        p.d(i7, 4, 0, 4);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 4, i7, 4));
        p.d(i7, 7, 0, 7);
        new hw9(p, 7, i7, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        InputNameScreen.super.onDestroyView(view);
        n0().a.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156 && getView() != null) {
            sx6 p0 = p0();
            taf.o(p0.w0, ged.a);
        }
    }

    public final void onViewCreated(View view) {
        mhe mhe = view instanceof mhe ? (mhe) view : null;
        if (mhe != null) {
            mhe.onThemeChanged(km4.y0.r(view));
        }
        l0().setActiveButtonClickListener(new lx6(this, 2));
        nf l0 = l0();
        k77 k77 = F0[5];
        l0.setEnabled(((String) this.D0.a(this)).length() > 0);
        m0().b(new mx6(this, 1));
        n0().b(new mx6(this, 2));
        p0().q(o0(), n0().a.isFocused());
        n0().a.setOnFocusChangeListener(new xp8(1, new mx6(this, 3)));
        ex9 h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new or3(6, this));
        }
        q02 q02 = p0().x0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(q02, getViewLifecycleOwner().R(), ob7), new qx6((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(new ik5(wx3.e(p0().Y, getViewLifecycleOwner().R(), ob7), 8), new px6((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((hp7) this.y0.getValue()).c, getViewLifecycleOwner().R(), ob7), new nx6((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final sx6 p0() {
        return (sx6) this.z0.getValue();
    }

    public final void q0() {
        k77[] k77Arr = BottomSheetWidget.B0;
        sgc sgc = null;
        jc3 c2 = rf0.c(utb.oneme_login_input_name_confirmation_title, 6, (Bundle) null);
        int i = utb.oneme_login_input_name_confirmation_description;
        k77 k77 = F0[1];
        c2.f(new jge(i, cs.g0(new Object[]{(String) this.c.a(this)})));
        c2.d(jpb.oneme_login_input_name_confirmation_cancel, new hge(utb.oneme_login_input_name_confirmation_cancel));
        c2.b(jpb.oneme_login_input_name_confirmation_return, new hge(utb.oneme_login_input_name_confirmation_return));
        ConfirmationBottomSheet e = c2.e();
        e.setTargetController(this);
        InputNameScreen inputNameScreen = this;
        while (inputNameScreen.getParentController() != null) {
            inputNameScreen = inputNameScreen.getParentController();
        }
        ygc ygc = inputNameScreen instanceof ygc ? (ygc) inputNameScreen : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        e.y0(this);
        if (sgc != null) {
            vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "BottomSheetWidget");
            sgc.G(vgc);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, lu7] */
    public InputNameScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new Object();
        Class<String> cls = String.class;
        this.b = new jr(cls, "screen:input_name:token");
        this.c = new jr(cls, "screen:input_name:phone");
        this.o = new jj7(new fs5(16), (s16) null, 6);
        this.X = sy6.d;
        ko7 ko7 = ko7.a;
        this.Y = ko7.getAccessor().d(qna.class);
        this.Z = ko7.getAccessor().d(f03.class);
        this.w0 = ez3.O(3, new lx6(this, 0));
        this.x0 = ko7.getAccessor().d(c70.class);
        this.y0 = m25getSharedViewModelcp94BC8("LoginScope", hp7.class, (s16) null);
        this.z0 = createViewModelLazy(sx6.class, new js5(3, new lx6(this, 1)));
        this.A0 = viewBinding(jpb.oneme_login_input_name);
        this.B0 = viewBinding(jpb.oneme_login_input_surname);
        this.C0 = viewBinding(jpb.oneme_login_input_name_btn_container);
        this.D0 = new jr(cls, "", "screen:input_name:name");
        this.E0 = new jr(cls, "", "screen:input_name:surname");
    }
}
