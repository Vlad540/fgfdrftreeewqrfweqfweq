package one.me.chatscreen.chatstatus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatstatus/ChatStatusBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Lun2;", "chatStatus", "(Ljava/lang/String;Lun2;Lx54;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatStatusBottomWidget extends Widget {
    public static final /* synthetic */ k77[] c;
    public final t97 a;
    public final n0c b;

    static {
        Class<ChatStatusBottomWidget> cls = ChatStatusBottomWidget.class;
        c = new k77[]{new hc9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), m4b.g(m7c.a, cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ChatStatusBottomWidget(String str, un2 un2, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("arg_key_chat_status", un2)));
    }

    public final nn2 l0() {
        return (nn2) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        urd.B(new ql2(3, (Continuation) null, 1), frameLayout);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(j2a.c);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.c);
        oneMeButton.setAppearance(s0a.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 0;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams);
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(wx3.e(new ik5(l0().e1, 2), getViewLifecycleOwner().R(), ob7.o), new wn2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ChatStatusBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, "arg_key_scope_id");
        k77 k77 = c[0];
        this.a = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, nn2.class, (s16) null);
        this.b = viewBinding(j2a.c);
    }
}
