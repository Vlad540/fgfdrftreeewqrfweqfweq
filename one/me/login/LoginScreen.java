package one.me.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class LoginScreen extends Widget {
    public static final /* synthetic */ k77[] c;
    public final n0c a = Widget.childRouter$default(this, jpb.oneme_login_conductor, (u16) null, 2, (Object) null);
    public final String b = "LoginScope";

    static {
        k77 khb = new khb(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0);
        m7c.a.getClass();
        c = new k77[]{khb};
    }

    public LoginScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        createViewModelLazy(hp7.class, new js5(11, new ib7(8)));
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m6getScopeIdIluPPks() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jpb.oneme_login_conductor);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k77[] k77Arr = c;
        k77 k77 = k77Arr[0];
        n0c n0c = this.a;
        if (!((sgc) n0c.T0(this, k77)).n()) {
            ((sgc) n0c.T0(this, k77Arr[0])).e = 1;
            ((sgc) n0c.T0(this, k77Arr[0])).R(new vgc(new InputPhoneScreen(), (String) null, (wr3) null, (wr3) null, false, -1));
        }
    }
}
