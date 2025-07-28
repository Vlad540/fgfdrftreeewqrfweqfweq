package one.me.startconversation.chattitleicon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Lac0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Lkpd;", "createType", "([JLkpd;)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatTitleIconScreen extends Widget implements lc3, ac0 {
    public static final /* synthetic */ k77[] D0;
    public final nl0 A0;
    public final nl0 B0;
    public final nl0 C0;
    public final jj7 X;
    public final t97 Y;
    public final t97 Z;
    public final sy6 a;
    public final r7e b;
    public final jr c;
    public final jr o;
    public final t97 w0;
    public final nl0 x0;
    public final nl0 y0;
    public final nl0 z0;

    static {
        Class<ChatTitleIconScreen> cls = ChatTitleIconScreen.class;
        k77 khb = new khb(cls, "ids", "getIds()[J", 0);
        n7c n7c = m7c.a;
        D0 = new k77[]{khb, wn6.e(n7c, cls, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "hint", "getHint()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, n7c), wn6.f(cls, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, n7c), wn6.f(cls, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0, n7c), wn6.f(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public ChatTitleIconScreen(long[] jArr, kpd kpd) {
        this(jjd.j(new wia[]{new wia("ids", jArr), new wia("create_type", kpd)}));
    }

    public static final xe4 l0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        k77 k77 = D0[6];
        return (xe4) chatTitleIconScreen.B0.getValue();
    }

    public static final mz9 m0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        k77 k77 = D0[4];
        return (mz9) chatTitleIconScreen.z0.getValue();
    }

    public final void a(String str, RectF rectF, Rect rect) {
        q0().r(str, rectF, rect);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final rnc getScreenDelegate() {
        return this.X;
    }

    public final void i(int i, Bundle bundle) {
        if (i == kca.b) {
            mpd mpd = mpd.c;
            mpd.getClass();
            mpd.P1().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == kca.c) {
            q0().s();
        }
    }

    public final mda n0() {
        k77 k77 = D0[5];
        return (mda) this.A0.getValue();
    }

    public final OneMeButton o0() {
        k77 k77 = D0[7];
        return (OneMeButton) this.C0.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ChatTitleIconScreen.super.onActivityResult(i, i2, intent);
        if (i != 666) {
            if (i == 777 && i2 == -1) {
                gp2 q0 = q0();
                taf.n(q0, ((pae) q0.Z.getValue()).b(), (ru3) null, new cp2(q0, intent != null ? intent.getData() : null, (Continuation) null), 2);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null) {
                q0().u();
                return;
            }
            gp2 q02 = q0();
            taf.n(q02, ((pae) q02.Z.getValue()).b(), (ru3) null, new dp2(intent, q02, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        bm3.H(n0().a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        k77 k77 = D0[2];
        linearLayout.addView((nea) this.x0.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext(), (AttributeSet) null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        nestedScrollView.setFillViewport(true);
        ty0 ty0 = new ty0(1, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(nestedScrollView.getContext());
        constraintLayout.setId(kca.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ty0.invoke(constraintLayout);
        nestedScrollView.addView(constraintLayout);
        linearLayout.addView(nestedScrollView);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qna) this.Z.getValue()).b(strArr)) {
            q0().s();
        }
    }

    public final void onViewCreated(View view) {
        t0c t0c = q0().D0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new uo2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(q0().E0, getViewLifecycleOwner().R(), ob7), new vo2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(q0().F0, new xo2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final kpd p0() {
        k77 k77 = D0[1];
        return (kpd) this.o.a(this);
    }

    public final gp2 q0() {
        return (gp2) this.Y.getValue();
    }

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        this.b = new r7e(new hk2(6));
        this.c = new jr(long[].class, new long[0], "ids");
        this.o = new jr(kpd.class, "create_type");
        this.X = new jj7(new so2(this, 1), (s16) null, 6);
        this.Y = createViewModelLazy(gp2.class, new rh2(13, new x2(this, 23, bundle)));
        ipd ipd = ipd.a;
        this.Z = ipd.getAccessor().d(qna.class);
        this.w0 = ipd.getAccessor().d(xg9.class);
        this.x0 = binding(new so2(this, 2));
        this.y0 = binding(new so2(this, 3));
        this.z0 = binding(new so2(this, 4));
        this.A0 = binding(new so2(this, 5));
        this.B0 = binding(new so2(this, 6));
        this.C0 = binding(new so2(this, 7));
    }
}
