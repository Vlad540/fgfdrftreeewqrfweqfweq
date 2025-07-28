package one.me.chatscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/ChatScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Ltq3;", "Llc3;", "Lgy5;", "Lvua;", "Lm08;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatScreen extends SwipeWidget implements tq3, lc3, gy5, vua, m08 {
    public static final /* synthetic */ k77[] n1;
    public final jr A0;
    public final jr B0;
    public final jr C0;
    public boolean D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final gk2 I0;
    public final t97 J0;
    public final t97 K0;
    public final t97 L0;
    public final t97 M0;
    public final t97 N0;
    public final String O0;
    public final n0c P0;
    public final n0c Q0;
    public final n0c R0;
    public final n0c S0;
    public final n0c T0;
    public final n0c U0;
    public final n0c V0;
    public final n0c W0;
    public final xg9 X;
    public z68 X0;
    public final iq1 Y;
    public final n0c Y0;
    public final t97 Z;
    public final n0c Z0;
    public final n0c a1;
    public final t97 b1;
    public final er7 c1;
    public final n0c d1;
    public final n0c e1;
    public final n0c f1;
    public final n0c g1;
    public final n0c h1;
    public final n0c i1;
    public final t97 j1;
    public final t97 k1;
    public gba l1;
    public Bundle m1;
    public final jj7 o = new jj7((s16) new gk2(this, 0), (s16) new gk2(this, 12), 4);
    public final u5 w0;
    public final jr x0;
    public final jr y0;
    public final jr z0;

    static {
        Class<ChatScreen> cls = ChatScreen.class;
        n1 = new k77[]{new khb(cls, "unspecifiedChatId", "getUnspecifiedChatId()J", 0), m4b.g(m7c.a, cls, "type", "getType()Lone/me/chatscreen/deeplink/ChatDeepLinkRoutes$Type;", 0), new khb(cls, "openSearchField", "getOpenSearchField()Z", 0), new hc9(cls, "forwardMessageIds", "getForwardMessageIds()[J"), new hc9(cls, "forwardAttachId", "getForwardAttachId()Ljava/lang/Long;"), new hc9(cls, "isForwardAttach", "isForwardAttach()Z"), new khb(cls, "messagesContainer", "getMessagesContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "messagesRouter", "getMessagesRouter()Lcom/bluelinelabs/conductor/Router;", 0), new khb(cls, "bottomContainer", "getBottomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "mediaBarContainer", "getMediaBarContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "mediaBarRouter", "getMediaBarRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new khb(cls, "chatMainContainer", "getChatMainContainer()Landroid/widget/LinearLayout;", 0), new khb(cls, "videoMsgContainer", "getVideoMsgContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "videoMsgRouter", "getVideoMsgRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0), new khb(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new khb(cls, "chatBackground", "getChatBackground()Landroid/view/View;", 0), new khb(cls, "suggestionsContainer", "getSuggestionsContainer()Landroid/view/ViewGroup;", 0), new khb(cls, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [java.lang.Object, er7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatScreen(Bundle bundle) {
        super(bundle);
        sl2 sl2 = sl2.a;
        this.X = (xg9) sl2.getAccessor().c(xg9.class);
        this.Y = (iq1) sl2.getAccessor().c(iq1.class);
        t97 t97 = rl2.a;
        this.Z = sl2.getAccessor().d(jb5.class);
        this.w0 = new u5(1, this);
        Class<Long> cls = Long.class;
        this.x0 = new jr(cls, HasExtraData.KEY_ID);
        this.y0 = new jr(s62.class, "type");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.z0 = new jr(cls2, bool, "open_search_field");
        this.A0 = new jr(long[].class, (Object) null, "forward_msg_ids");
        this.B0 = new jr(cls, (Object) null, "forward_attach_id");
        this.C0 = new jr(cls2, bool, "is_forward_attach");
        this.D0 = true;
        this.E0 = createViewModelLazy(nn2.class, new rh2(4, new gk2(this, 13)));
        this.F0 = createViewModelLazy(nu8.class, new rh2(5, new gk2(this, 14)));
        this.G0 = createViewModelLazy(i08.class, new rh2(6, new gk2(this, 15)));
        this.H0 = createViewModelLazy(nx8.class, new rh2(7, new p22(28)));
        this.I0 = new gk2(this, 1);
        this.J0 = createViewModelLazy(e3e.class, new rh2(8, new gk2(this, 2)));
        this.K0 = createViewModelLazy(vu7.class, new rh2(9, new p22(29)));
        this.L0 = createViewModelLazy(u68.class, new rh2(10, new hk2(0)));
        this.M0 = createViewModelLazy(mrc.class, new rh2(11, new gk2(this, 4)));
        createViewModelLazy(rua.class, new rh2(12, new gk2(this, 9)));
        this.N0 = createViewModelLazy(h3c.class, new rh2(3, new hk2(3)));
        this.O0 = "ChatScreen";
        int i = j2a.k;
        this.P0 = viewBinding(i);
        this.Q0 = Widget.childRouter$default(this, i, (u16) null, 2, (Object) null);
        int i2 = j2a.b;
        this.R0 = viewBinding(i2);
        this.S0 = childSlotRouter(i2);
        int i3 = j2a.i;
        this.T0 = viewBinding(i3);
        this.U0 = childSlotRouter(i3);
        int i4 = j2a.j;
        this.V0 = viewBinding(i4);
        this.W0 = Widget.childRouter$default(this, i4, (u16) null, 2, (Object) null);
        this.Y0 = viewBinding(j2a.h);
        int i5 = j2a.p;
        this.Z0 = viewBinding(i5);
        this.a1 = childSlotRouter(i5);
        this.b1 = sl2.getAccessor().d(fr7.class);
        this.c1 = new Object();
        this.d1 = viewBinding(j2a.o);
        this.e1 = viewBinding(j2a.m);
        this.f1 = viewBinding(j2a.l);
        this.g1 = viewBinding(j2a.a);
        int i6 = j2a.n;
        this.h1 = viewBinding(i6);
        this.i1 = childSlotRouter(i6);
        this.j1 = ez3.O(3, new gk2(this, 11));
        this.k1 = ez3.O(3, new hk2(4));
    }

    public static void P0(ChatScreen chatScreen, Integer num, String str, Integer num2, Integer num3, int i) {
        String str2 = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        chatScreen.getClass();
        if (r4 == null) {
            if (num != null) {
                r4 = d8.u(chatScreen.getContext(), num.intValue());
            } else {
                r4 = null;
            }
            if (r4 == null) {
                return;
            }
        }
        if (num2 != null) {
            str2 = d8.u(chatScreen.getContext(), num2.intValue());
        }
        gba gba = chatScreen.l1;
        if (gba != null) {
            gba.a();
        }
        hba hba = new hba(chatScreen);
        hba.i(r4);
        hba.b(str2);
        hba.c(new pba(0, chatScreen.x0().getMeasuredHeight(), 3));
        if (num3 != null) {
            hba.f(new vba(num3.intValue()));
        }
        chatScreen.l1 = hba.j();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: rr3} */
    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    /* JADX WARNING: type inference failed for: r0v1, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r7v5, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    /* JADX WARNING: type inference failed for: r0v8, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t0(one.me.chatscreen.ChatScreen r10, it8 r11) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r10.getClass()
            boolean r3 = r11.a
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 0
            if (r3 == 0) goto L_0x00ea
            z68 r11 = r10.X0
            if (r11 == 0) goto L_0x01ca
            r3 = r10
        L_0x0014:
            rr3 r8 = r3.getParentController()
            if (r8 == 0) goto L_0x001f
            rr3 r3 = r3.getParentController()
            goto L_0x0014
        L_0x001f:
            boolean r8 = r3 instanceof ygc
            if (r8 == 0) goto L_0x0026
            ygc r3 = (ygc) r3
            goto L_0x0027
        L_0x0026:
            r3 = r7
        L_0x0027:
            if (r3 == 0) goto L_0x002e
            int r3 = r3.s()
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            nea r10 = r10.J0()
            int r10 = r10.getBottom()
            int r10 = r10 + r3
            boolean r3 = r11.e
            android.view.View r8 = r11.b
            int r9 = r11.k
            if (r3 == 0) goto L_0x0099
            int r9 = r9 + r10
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            int r10 = r10 - r9
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x005b
            r7 = r3
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x005b:
            if (r7 == 0) goto L_0x0060
            int r3 = r7.bottomMargin
            goto L_0x0061
        L_0x0060:
            r3 = r2
        L_0x0061:
            int r3 = r3 + r10
            android.animation.AnimatorSet r4 = r11.i
            if (r4 == 0) goto L_0x0069
            r4.cancel()
        L_0x0069:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.ValueAnimator r3 = r11.b(r3)
            int r7 = r11.c()
            int[] r10 = new int[]{r7, r10}
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r10)
            w68 r7 = new w68
            r7.<init>(r11, r1)
            r10.addUpdateListener(r7)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r3
            r0[r1] = r10
            r4.playTogether(r0)
            r4.setDuration(r5)
            r4.start()
            r11.i = r4
            goto L_0x01ca
        L_0x0099:
            int r9 = r9 + r10
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            int r10 = r10 - r9
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r11.d()
            if (r0 == 0) goto L_0x00c7
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00c7
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00c1
            r1.height = r10
            r0.setLayoutParams(r1)
            goto L_0x00c7
        L_0x00c1:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x00c7:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x00d2
            r7 = r0
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x00d2:
            if (r7 == 0) goto L_0x00d6
            int r2 = r7.bottomMargin
        L_0x00d6:
            int r10 = r10 + r2
            android.view.View r11 = r11.c
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            r11.setPadding(r0, r1, r2, r10)
            goto L_0x01ca
        L_0x00ea:
            z68 r3 = r10.X0
            if (r3 == 0) goto L_0x01ca
            one.me.keyboardmedia.MediaKeyboardWidget r8 = r3.d()
            if (r8 == 0) goto L_0x00ff
            android.view.View r8 = r8.getView()
            if (r8 == 0) goto L_0x00ff
            int r8 = r8.getHeight()
            goto L_0x0100
        L_0x00ff:
            r8 = r2
        L_0x0100:
            int r3 = r3.c()
            if (r8 <= r3) goto L_0x01ca
            z68 r3 = r10.X0
            if (r3 == 0) goto L_0x01ca
            x2 r8 = new x2
            r9 = 22
            r8.<init>((java.lang.Object) r11, (int) r9, (java.lang.Object) r10)
            boolean r10 = r3.e
            android.view.View r11 = r3.b
            if (r10 == 0) goto L_0x0184
            int r10 = r3.c()
            int r4 = r3.c()
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x012a
            r7 = r11
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            int r11 = r7.bottomMargin
            goto L_0x0130
        L_0x012f:
            r11 = r2
        L_0x0130:
            int r4 = r4 + r11
            android.animation.AnimatorSet r11 = r3.i
            if (r11 == 0) goto L_0x0138
            r11.cancel()
        L_0x0138:
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            android.animation.ValueAnimator r4 = r3.b(r4)
            one.me.keyboardmedia.MediaKeyboardWidget r7 = r3.d()
            if (r7 == 0) goto L_0x0152
            android.view.View r7 = r7.getView()
            if (r7 == 0) goto L_0x0152
            int r7 = r7.getHeight()
            goto L_0x0153
        L_0x0152:
            r7 = r2
        L_0x0153:
            int[] r10 = new int[]{r7, r10}
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r10)
            w68 r7 = new w68
            r7.<init>(r3, r1)
            r10.addUpdateListener(r7)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r4
            r0[r1] = r10
            r11.playTogether(r0)
            r11.setDuration(r5)
            zu4 r10 = new zu4
            r0 = 14
            r10.<init>(r3, r0, r8)
            fh r0 = new fh
            r0.<init>(r11, r10, r2)
            r11.addListener(r0)
            r11.start()
            r3.i = r11
            goto L_0x01ca
        L_0x0184:
            int r10 = r3.c()
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r3.d()
            if (r0 == 0) goto L_0x01a6
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x01a6
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x01a0
            r1.height = r10
            r0.setLayoutParams(r1)
            goto L_0x01a6
        L_0x01a0:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x01a6:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01b1
            r7 = r11
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x01b1:
            if (r7 == 0) goto L_0x01b5
            int r2 = r7.bottomMargin
        L_0x01b5:
            int r10 = r10 + r2
            android.view.View r11 = r3.c
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            r11.setPadding(r0, r1, r2, r10)
            r8.invoke()
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.t0(one.me.chatscreen.ChatScreen, it8):void");
    }

    public static final void u0(ChatScreen chatScreen, nea nea, boolean z) {
        b1f b1f;
        chatScreen.getClass();
        int C = xy6.C(tge.e(nea.getTitle()));
        int i = 0;
        if (z) {
            b1f a = tge.a(nea.getTitle());
            if ((a != null ? a.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a2 = tge.a(nea.getTitle());
            if (a2 != null) {
                i = a2.a;
            }
            if (i != C) {
                b1f = new b1f(nea.getContext(), C, new hd1(20));
                tge.d(nea.getTitle(), b1f);
            }
        }
        b1f = null;
        tge.d(nea.getTitle(), b1f);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [rr3, one.me.chatscreen.search.SearchMessageBottomWidget] */
    /* JADX WARNING: type inference failed for: r5v2, types: [rr3, one.me.chatscreen.chatstatus.ChatStatusBottomWidget] */
    public static final void v0(ChatScreen chatScreen, iq0 iq0) {
        chatScreen.getClass();
        int ordinal = iq0.ordinal();
        String str = chatScreen.O0;
        if (ordinal == 0) {
            ax2 y02 = chatScreen.y0();
            if (!hhd.f(y02.b(), "write_controller")) {
                vgc vgc = new vgc(new MessageWriteWidget(str, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("write_controller");
                y02.a.R(vgc);
            }
        } else if (ordinal == 1) {
            ax2 y03 = chatScreen.y0();
            if (!hhd.f(y03.b(), "search_bar_controller")) {
                vgc vgc2 = new vgc(new SearchMessageBottomWidget(str, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc2.d("search_bar_controller");
                y03.a.R(vgc2);
            }
        } else if (ordinal == 2) {
            un2 un2 = (un2) chatScreen.L0().e1.a.getValue();
            if (un2 != null) {
                if (un2 == un2.Y) {
                    ax2 y04 = chatScreen.y0();
                    y04.a.P(hw4.a, (wr3) null);
                    return;
                }
                ax2 y05 = chatScreen.y0();
                if (!hhd.f(y05.b(), "unblock_contact_controller_tag")) {
                    vgc vgc3 = new vgc(new ChatStatusBottomWidget(str, un2, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                    vgc3.d("unblock_contact_controller_tag");
                    y05.a.R(vgc3);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.chatscreen.ChatScreen, java.lang.Object] */
    public final mnc A0() {
        vgc vgc = (vgc) o23.f0(getRouter().e());
        rr3 rr3 = vgc != null ? vgc.a : null;
        rr3 a = ((ax2) this.U0.T0(this, n1[11])).a();
        if (!hhd.f(rr3, this) && (rr3 instanceof rg9)) {
            return ((rg9) rr3).o();
        }
        if (a instanceof MediaBarWidget) {
            MediaBarWidget mediaBarWidget = (MediaBarWidget) a;
            if (mediaBarWidget.w0().getScrollState() != x0b.a) {
                return mediaBarWidget.o();
            }
        }
        return mnc.Q0;
    }

    public final nu8 B0() {
        return (nu8) this.F0.getValue();
    }

    public final MessageWriteWidget C0() {
        MessageWriteWidget a = y0().a();
        if (a instanceof MessageWriteWidget) {
            return a;
        }
        return null;
    }

    public final nx8 D0() {
        return (nx8) this.H0.getValue();
    }

    public final sgc E0() {
        return (sgc) this.Q0.T0(this, n1[7]);
    }

    public final mrc F0() {
        return (mrc) this.M0.getValue();
    }

    public final raa G0() {
        return (raa) this.e1.T0(this, n1[18]);
    }

    public final ViewGroup H0() {
        return (ViewGroup) this.h1.T0(this, n1[21]);
    }

    public final ax2 I0() {
        return (ax2) this.i1.T0(this, n1[22]);
    }

    public final nea J0() {
        return (nea) this.d1.T0(this, n1[17]);
    }

    public final az1 K0() {
        return (az1) this.Z0.T0(this, n1[15]);
    }

    public final nn2 L0() {
        return (nn2) this.E0.getValue();
    }

    public final boolean M0() {
        return js.u(getContext()).b && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.ChatScreen] */
    public final void N0(boolean z) {
        k77[] k77Arr = BottomSheetWidget.B0;
        hge hge = new hge(rhc.l0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("forward_cancel_stay_on_screen", z);
        jc3 a = a24.a(hge, bundle, 4);
        a.b(qhc.q0, new hge(rhc.k0));
        a.c(qhc.p0, new hge(rhc.j0));
        ConfirmationBottomSheet e = a.e();
        e.setTargetController(this);
        rr3 rr3 = this;
        while (rr3.getParentController() != null) {
            rr3 = rr3.getParentController();
        }
        sgc sgc = null;
        ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
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

    /* JADX WARNING: type inference failed for: r7v0, types: [rr3, one.me.chatscreen.mediabar.MediaBarWidget] */
    public final void O0() {
        i22 i22 = (i22) L0().Z0.a.getValue();
        if (i22 != null) {
            MessageWriteWidget C02 = C0();
            if (C02 != null) {
                C02.m();
            }
            k77[] k77Arr = n1;
            ((az1) this.T0.T0(this, k77Arr[10])).setVisibility(0);
            ax2 ax2 = (ax2) this.U0.T0(this, k77Arr[11]);
            if (!hhd.f(ax2.b(), "media_bar_controller")) {
                ? mediaBarWidget = new MediaBarWidget(this.O0, i22.a, (x54) null);
                mediaBarWidget.g1 = this;
                vgc vgc = new vgc(mediaBarWidget, (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("media_bar_controller");
                ax2.a.R(vgc);
            }
            i08 i08 = (i08) this.G0.getValue();
            Long l = (Long) i08.b.invoke();
            if (l == null) {
                i08.x0.n(yy7.a);
                return;
            }
            qod D = xs7.D(i08.a, ((pae) i08.Y.getValue()).b(), ru3.b, new zz7(i08, l, (Continuation) null));
            i08.K0.o1(i08, i08.M0[0], D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r3.isInstance(r1) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 372(0x174, float:5.21E-43)
            r4 = 34
            r5 = 0
            if (r1 == r3) goto L_0x008c
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r1 == r3) goto L_0x0035
            r2 = 1010(0x3f2, float:1.415E-42)
            if (r1 == r2) goto L_0x0017
            goto L_0x0131
        L_0x0017:
            r1 = -1
            r2 = r18
            if (r2 == r1) goto L_0x001d
            return
        L_0x001d:
            t97 r0 = r0.G0
            java.lang.Object r0 = r0.getValue()
            i08 r0 = (defpackage.i08) r0
            r0.getClass()
            vy7 r1 = new vy7
            r2 = 0
            r1.<init>(r2)
            us0 r0 = r0.x0
            r0.n(r1)
            goto L_0x0131
        L_0x0035:
            if (r2 != 0) goto L_0x0039
        L_0x0037:
            r1 = r5
            goto L_0x0050
        L_0x0039:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<dm7> r3 = dm7.class
            java.lang.String r6 = "location_data"
            if (r1 < r4) goto L_0x0046
            java.io.Serializable r1 = defpackage.iz6.d(r2, r6, r3)
            goto L_0x0050
        L_0x0046:
            java.io.Serializable r1 = r2.getSerializableExtra(r6)
            boolean r3 = r3.isInstance(r1)
            if (r3 == 0) goto L_0x0037
        L_0x0050:
            r7 = r1
            dm7 r7 = (dm7) r7
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = "zoom"
            r3 = 0
            float r1 = r2.getFloatExtra(r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            if (r7 == 0) goto L_0x0131
            if (r1 == 0) goto L_0x0131
            nn2 r6 = r16.L0()
            float r8 = r1.floatValue()
            nu8 r1 = r16.B0()
            java.lang.Long r11 = r1.w()
            nu8 r0 = r16.B0()
            pt8 r0 = r0.v()
            if (r0 == 0) goto L_0x0084
            jv5 r5 = r0.a()
        L_0x0084:
            r12 = r5
            r9 = 0
            r6.A(r7, r8, r9, r11, r12)
            goto L_0x0131
        L_0x008c:
            if (r2 == 0) goto L_0x00aa
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "contacts.picker.result.key"
            java.lang.Class<mm3> r6 = mm3.class
            if (r1 < r4) goto L_0x009b
            java.io.Serializable r1 = defpackage.iz6.d(r2, r3, r6)
            goto L_0x00a7
        L_0x009b:
            java.io.Serializable r1 = r2.getSerializableExtra(r3)
            boolean r2 = r6.isInstance(r1)
            if (r2 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = r5
        L_0x00a7:
            mm3 r1 = (mm3) r1
            goto L_0x00ab
        L_0x00aa:
            r1 = r5
        L_0x00ab:
            if (r1 == 0) goto L_0x0131
            nn2 r2 = r16.L0()
            nu8 r3 = r16.B0()
            java.lang.Long r10 = r3.w()
            nu8 r3 = r16.B0()
            pt8 r3 = r3.v()
            if (r3 == 0) goto L_0x00c9
            jv5 r3 = r3.a()
            r13 = r3
            goto L_0x00ca
        L_0x00c9:
            r13 = r5
        L_0x00ca:
            t0c r3 = r2.Z0
            zqd r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            i22 r3 = (i22) r3
            if (r3 == 0) goto L_0x0108
            pae r4 = r2.u()
            n3a r4 = (defpackage.n3a) r4
            ju3 r4 = r4.b()
            ru3 r15 = defpackage.ru3.b
            vm2 r14 = new vm2
            java.util.List r6 = r1.a
            r11 = r6
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.List r1 = r1.b
            r12 = r1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            long r8 = r3.a
            r1 = 0
            r6 = r14
            r7 = r2
            r3 = r14
            r14 = r1
            r6.<init>(r7, r8, r10, r11, r12, r13, r14)
            kotlinx.coroutines.internal.ContextScope r1 = r2.a
            qod r1 = defpackage.xs7.D(r1, r4, r15, r3)
            k77[] r3 = defpackage.nn2.g1
            r4 = 3
            r3 = r3[r4]
            e3 r4 = r2.P0
            r4.o1(r2, r3, r1)
        L_0x0108:
            k77[] r1 = n1
            r2 = 11
            r1 = r1[r2]
            n0c r2 = r0.U0
            java.lang.Object r0 = r2.T0(r0, r1)
            ax2 r0 = (ax2) r0
            rr3 r0 = r0.a()
            boolean r1 = r0 instanceof one.me.chatscreen.mediabar.MediaBarWidget
            if (r1 == 0) goto L_0x0121
            r5 = r0
            one.me.chatscreen.mediabar.MediaBarWidget r5 = (one.me.chatscreen.mediabar.MediaBarWidget) r5
        L_0x0121:
            if (r5 == 0) goto L_0x0131
            android.view.View r0 = r5.getView()
            if (r0 == 0) goto L_0x0131
            z0b r0 = r5.w0()
            r1 = 1
            r0.j(r1)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.Q(int, int, android.content.Intent):void");
    }

    public final boolean R() {
        return ((jb5) this.Z.getValue()).t() && this.D0;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m49getScopeIdIluPPks() {
        return this.O0;
    }

    public final rnc getScreenDelegate() {
        return this.o;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.chatscreen.ChatScreen, one.me.sdk.conductor.changehandlers.swipe.SwipeWidget] */
    public final boolean handleBack() {
        if (getView() == null || !J0().b()) {
            h3c h3c = (h3c) this.N0.getValue();
            if (((Boolean) h3c.Y.getValue()).booleanValue()) {
                taf.o(h3c.c, a3c.a);
                return true;
            } else if (B0().v() != null) {
                N0(false);
                return true;
            } else {
                MessageWriteWidget C02 = C0();
                CharSequence charSequence = null;
                if (!(C02 == null || C02.getView() == null)) {
                    charSequence = C02.p0().getText();
                }
                boolean handleBack = ChatScreen.super.handleBack();
                View view = getView();
                if (view != null) {
                    view.requestApplyInsets();
                }
                if (!handleBack) {
                    L0().z(charSequence, B0().w(), B0().u());
                }
                return handleBack;
            }
        } else {
            nx8 D02 = D0();
            taf.o(D02.w0, dx8.a);
            return true;
        }
    }

    public final void i(int i, Bundle bundle) {
        if (!z0().g(i)) {
            nn2 L02 = L0();
            L02.getClass();
            if (i == j2a.r || i == j2a.s) {
                i22 i22 = (i22) L02.Z0.a.getValue();
                if (i22 != null) {
                    taf.n(L02, L02.u().b(), (ru3) null, new mm2(L02, i22.a, (Continuation) null), 2);
                }
            } else if (i == qhc.m0 || i == qhc.n0 || i == qhc.l0 || i == qhc.o0) {
                xs7.E(L02.a, (hu3) null, (ru3) null, new im2(L02, i, (Continuation) null), 3);
            } else if (i == qhc.q0) {
                taf.o(L02.c1, new wl2(bundle != null ? bundle.getBoolean("forward_cancel_stay_on_screen") : false));
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        ((fr7) this.b1.getValue()).a(this.c1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final void onActivityResumed(Activity activity) {
        if (isAttached()) {
            ((fr7) this.b1.getValue()).b(this.c1);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatscreen.ChatScreen, java.lang.Object] */
    public final void onAttach(View view) {
        ChatScreen.super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new mp0(4, this));
        } else if (tge.c(J0().getTitle())) {
            u0(this, J0(), true);
        }
        getRouter().a(this.w0);
        Bundle bundle = this.m1;
        if (bundle != null) {
            this.m1 = null;
            onUpdateArgs(getArgs().deepCopy(), bundle);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.ChatScreen, one.me.sdk.conductor.changehandlers.swipe.SwipeWidget] */
    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        ChatScreen.super.onChangeStarted(wr3, xr3);
        xr3 xr32 = xr3.POP_ENTER;
        t97 t97 = this.b1;
        er7 er7 = this.c1;
        if (xr3 == xr32 || xr3 == xr3.PUSH_ENTER) {
            ((fr7) t97.getValue()).b(er7);
        } else if (xr3 == xr3.PUSH_EXIT) {
            if (getView() != null) {
                int i = e87.a;
                if (e87.b(e87.c)) {
                    bm3.q(requireActivity());
                }
            }
            F0().q();
            ((fr7) t97.getValue()).a(er7);
        }
    }

    public final void onContextAvailable(Context context) {
        ez3.N(new ck5(L0().f1, new vk2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ik2 ik2 = new ik2(this, 0);
        v6e v6e = new v6e(getContext());
        v6e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ik2.invoke(v6e);
        return v6e;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final void onDestroy() {
        ((wk7) sl2.a.getAccessor().c(wk7.class)).f.k = null;
        ChatScreen.super.onDestroy();
    }

    public final void onDestroyView(View view) {
        Drawable background = ((View) this.g1.T0(this, n1[20])).getBackground();
        if (background != null) {
            background.setCallback((Drawable.Callback) null);
        }
        this.l1 = null;
        z68 z68 = this.X0;
        if (z68 != null) {
            z68.a();
        }
        this.X0 = null;
        this.c1.b();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final void onDetach(View view) {
        ChatScreen.super.onDetach(view);
        getRouter().K(this.w0);
        if (getView() != null) {
            MessageWriteWidget C02 = C0();
            CharSequence charSequence = null;
            if ((C02 != null ? C02.getView() : null) != null) {
                nn2 L02 = L0();
                MessageWriteWidget C03 = C0();
                if (C03 != null) {
                    charSequence = C03.p0().getText();
                }
                L02.z(charSequence, B0().w(), B0().u());
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        z0().b(i, strArr, iArr);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.ChatScreen] */
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        ot8 ot8;
        ChatScreen.super.onUpdateArgs(bundle, bundle2);
        if (isAttached()) {
            long[] u0 = x87.u0("forward_msg_ids", bundle2);
            k77[] k77Arr = n1;
            k77 k77 = k77Arr[3];
            jr jrVar = this.A0;
            jrVar.b(this, u0);
            Long t0 = x87.t0("forward_attach_id", bundle2);
            k77 k772 = k77Arr[4];
            jr jrVar2 = this.B0;
            jrVar2.b(this, t0);
            Boolean s0 = x87.s0("is_forward_attach", bundle2);
            boolean booleanValue = s0 != null ? s0.booleanValue() : false;
            k77 k773 = k77Arr[5];
            Boolean valueOf = Boolean.valueOf(booleanValue);
            jr jrVar3 = this.C0;
            jrVar3.b(this, valueOf);
            k77 k774 = k77Arr[3];
            long[] jArr = (long[]) jrVar.a(this);
            String str = null;
            if (jArr != null) {
                Set h0 = cs.h0(jArr);
                k77 k775 = k77Arr[4];
                k77 k776 = k77Arr[5];
                ot8 = new ot8(h0, (Long) jrVar2.a(this), ((Boolean) jrVar3.a(this)).booleanValue());
            } else {
                ot8 = null;
            }
            B0().U0.setValue(ot8);
            vgc vgc = (vgc) o23.f0(E0().e());
            rr3 rr3 = vgc != null ? vgc.a : null;
            MessagesListWidget messagesListWidget = rr3 instanceof MessagesListWidget ? (MessagesListWidget) rr3 : null;
            if (messagesListWidget != null) {
                Bundle deepCopy = messagesListWidget.getArgs().deepCopy();
                if (bundle2.containsKey("from_forward")) {
                    messagesListWidget.getArgs().putBoolean("ARG_SKIP_UNREAD_DECOR", x87.B0("from_forward", bundle2));
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                }
                if (bundle2.containsKey("message_id")) {
                    Bundle args = messagesListWidget.getArgs();
                    Object obj = bundle2.get("message_id");
                    if (obj != null) {
                        str = obj.toString();
                    }
                    args.putString("ARG_LOAD_MESSAGE_ID", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                } else if (bundle2.containsKey("load_mark")) {
                    Bundle args2 = messagesListWidget.getArgs();
                    Object obj2 = bundle2.get("load_mark");
                    if (obj2 != null) {
                        str = obj2.toString();
                    }
                    args2.putString("ARG_LOAD_MARK", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                }
            }
        } else if (!bundle.equals(bundle2)) {
            this.m1 = bundle2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: one.me.sdk.arch.Widget} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0051, code lost:
        r1 = (kt8) r1.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22) {
        /*
            r21 = this;
            r8 = r21
            yb7 r0 = r21.getViewLifecycleScope()
            sk2 r1 = new sk2
            r9 = 0
            r1.<init>(r9, r8)
            r10 = 3
            defpackage.xs7.E(r0, r9, r9, r1, r10)
            z68 r0 = new z68
            r1 = 13
            k77[] r20 = n1
            r1 = r20[r1]
            n0c r2 = r8.W0
            java.lang.Object r1 = r2.T0(r8, r1)
            r12 = r1
            sgc r12 = (defpackage.sgc) r12
            r1 = 12
            r1 = r20[r1]
            n0c r2 = r8.V0
            java.lang.Object r1 = r2.T0(r8, r1)
            r13 = r1
            az1 r13 = (defpackage.az1) r13
            az1 r14 = r21.x0()
            gk2 r15 = new gk2
            r1 = 5
            r15.<init>(r8, r1)
            boolean r16 = r21.M0()
            yb7 r17 = r21.getViewLifecycleScope()
            nu8 r1 = r21.B0()
            t0c r1 = r1.F0
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i05 r1 = (i05) r1
            r7 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r1.a
            kt8 r1 = (kt8) r1
            if (r1 == 0) goto L_0x005a
            int r1 = r1.a
            goto L_0x005b
        L_0x005a:
            r1 = r7
        L_0x005b:
            r6 = 1
            r5 = 2
            if (r1 != r5) goto L_0x0062
            r18 = r6
            goto L_0x0064
        L_0x0062:
            r18 = r7
        L_0x0064:
            gk2 r1 = new gk2
            r2 = 6
            r1.<init>(r8, r2)
            r11 = r0
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.X0 = r0
            t97 r0 = r8.L0
            java.lang.Object r1 = r0.getValue()
            u68 r1 = (defpackage.u68) r1
            t0c r1 = r1.Z
            ik5 r2 = new ik5
            r3 = 2
            r2.<init>(r1, r3)
            nk2 r3 = new nk2
            r3.<init>(r1, r9, r8)
            ck5 r1 = new ck5
            r4 = 5
            r1.<init>(r2, r3, r4)
            zi1 r2 = new zi1
            r3 = 7
            r2.<init>(r1, r3)
            yb7 r1 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r1)
            java.lang.Object r0 = r0.getValue()
            u68 r0 = (defpackage.u68) r0
            l05 r11 = r0.X
            hp0 r12 = new hp0
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "handleMediaKeyboardEvents"
            r1 = 2
            java.lang.String r13 = "handleMediaKeyboardEvents(Lone/me/sdk/arch/event/Event;)V"
            r14 = 4
            r15 = 8
            r0 = r12
            r2 = r21
            r16 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            r14 = r7
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            ck5 r0 = new ck5
            r1 = 5
            r0.<init>(r11, r12, r1)
            yb7 r1 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r0, r1)
            nu8 r0 = r21.B0()
            t0c r0 = r0.H0
            ik5 r1 = new ik5
            r2 = 2
            r1.<init>(r0, r2)
            pk2 r2 = new pk2
            r2.<init>(r0, r9, r8)
            ck5 r0 = new ck5
            r3 = 5
            r0.<init>(r1, r2, r3)
            zi1 r1 = new zi1
            r2 = 8
            r1.<init>(r0, r2)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r1, r0)
            nu8 r0 = r21.B0()
            t0c r0 = r0.F0
            nc7 r1 = r8.lifecycleOwner
            pc7 r1 = r1.R()
            ob7 r11 = defpackage.ob7.o
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            ik5 r1 = new ik5
            r2 = 2
            r1.<init>(r0, r2)
            rk2 r0 = new rk2
            r0.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r1, r0, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            mrc r0 = r21.F0()
            t0c r0 = r0.Z
            kk2 r1 = new kk2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            yb7 r0 = r21.getViewLifecycleScope()
            mk2 r1 = new mk2
            r1.<init>(r9, r8)
            defpackage.xs7.E(r0, r9, r9, r1, r10)
            r0 = r20[r16]
            jr r0 = r8.z0
            java.lang.Object r1 = r0.a(r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0167
            mrc r1 = r21.F0()
            r2 = r20[r16]
            java.lang.Object r0 = r0.a(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.r(r0)
            android.os.Bundle r0 = r21.getArgs()
            java.lang.String r1 = "open_search_field"
            r0.remove(r1)
        L_0x0167:
            nn2 r0 = r21.L0()
            bc r0 = r0.d1
            mrc r1 = r21.F0()
            t0c r1 = r1.Y
            z9 r2 = new z9
            r3 = 4
            r2.<init>(r10, r9, r3)
            v11 r3 = new v11
            r4 = 4
            r3.<init>(r0, r1, r2, r4)
            pj5 r0 = defpackage.ez3.z(r3)
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            uk2 r1 = new uk2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            java.lang.String r0 = defpackage.xie.w(r21)
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            ob7 r1 = r1.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onViewCreated: viewstate="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.udd.p(r0, r1, new java.lang.Object[0])
            nn2 r0 = r21.L0()
            t0c r0 = r0.Y0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            bl2 r1 = new bl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nn2 r0 = r21.L0()
            t0c r0 = r0.a1
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            cl2 r1 = new cl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nn2 r0 = r21.L0()
            l05 r0 = r0.c1
            ob7 r1 = defpackage.ob7.c
            nc7 r2 = r21.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r0 = defpackage.wx3.e(r0, r2, r1)
            yk2 r1 = new yk2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nn2 r0 = r21.L0()
            hcd r0 = r0.b1
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            dl2 r1 = new dl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nu8 r0 = r21.B0()
            t0c r0 = r0.L0
            ik5 r1 = new ik5
            r2 = 2
            r1.<init>(r0, r2)
            kl2 r2 = new kl2
            r2.<init>(r0, r9, r8)
            ck5 r0 = new ck5
            r3 = 5
            r0.<init>(r1, r2, r3)
            zi1 r1 = new zi1
            r2 = 10
            r1.<init>(r0, r2)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r1, r0)
            nu8 r0 = r21.B0()
            l05 r0 = r0.X0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            el2 r1 = new el2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            t97 r0 = r8.G0
            java.lang.Object r0 = r0.getValue()
            i08 r0 = (defpackage.i08) r0
            l05 r0 = r0.A0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            fl2 r1 = new fl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nn2 r0 = r21.L0()
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x02f1
            nu8 r0 = r21.B0()
            t0c r0 = r0.P0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            gl2 r1 = new gl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
        L_0x02f1:
            nx8 r0 = r21.D0()
            l05 r0 = r0.x0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            hl2 r1 = new hl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nu8 r0 = r21.B0()
            l05 r0 = r0.D0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            il2 r1 = new il2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            r0 = 19
            r0 = r20[r0]
            n0c r1 = r8.f1
            java.lang.Object r0 = r1.T0(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            sgc r0 = r8.getChildRouter(r0)
            r0.e = r13
            r0.Q(r14)
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0362
            one.me.pinbars.PinBarsWidget r1 = new one.me.pinbars.PinBarsWidget
            java.lang.String r2 = r8.O0
            r1.<init>(r2, r9)
            vgc r1 = defpackage.n06.f(r1, r9, r9)
            r0.R(r1)
        L_0x0362:
            nx8 r0 = r21.D0()
            t0c r0 = r0.Z
            ik5 r1 = new ik5
            r2 = 2
            r1.<init>(r0, r2)
            nc7 r0 = r21.getViewLifecycleOwner()
            pc7 r0 = r0.R()
            rn1 r0 = defpackage.wx3.e(r1, r0, r11)
            jl2 r1 = new jl2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            t97 r0 = r8.K0
            java.lang.Object r0 = r0.getValue()
            vu7 r0 = (vu7) r0
            l05 r0 = r0.c
            ik5 r10 = new ik5
            r1 = 2
            r10.<init>(r0, r1)
            hp0 r12 = new hp0
            java.lang.String r5 = "showAddLinkBottomsheet(Lone/me/sdk/messagewrite/markdown/AddLinkState;)V"
            r6 = 4
            r1 = 2
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "showAddLinkBottomsheet"
            r7 = 9
            r0 = r12
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            ck5 r0 = new ck5
            r1 = 5
            r0.<init>(r10, r12, r1)
            yb7 r1 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r0, r1)
            t97 r0 = r8.N0
            java.lang.Object r1 = r0.getValue()
            h3c r1 = (h3c) r1
            l05 r1 = r1.b
            nc7 r2 = r21.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r1 = defpackage.wx3.e(r1, r2, r11)
            zk2 r2 = new zk2
            r2.<init>(r9, r8)
            ck5 r3 = new ck5
            r4 = 5
            r3.<init>(r1, r2, r4)
            yb7 r1 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r3, r1)
            java.lang.Object r0 = r0.getValue()
            h3c r0 = (h3c) r0
            t0c r0 = r0.w0
            nc7 r1 = r21.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r11)
            al2 r1 = new al2
            r1.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r0, r1, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            t97 r0 = r8.J0
            java.lang.Object r0 = r0.getValue()
            e3e r0 = (e3e) r0
            t0c r0 = r0.H0
            ik5 r1 = new ik5
            r2 = 2
            r1.<init>(r0, r2)
            tk2 r0 = new tk2
            r0.<init>(r9, r8)
            ck5 r2 = new ck5
            r3 = 5
            r2.<init>(r1, r0, r3)
            yb7 r0 = r21.getViewLifecycleScope()
            defpackage.ez3.N(r2, r0)
            nn2 r0 = r21.L0()
            r0.getClass()
            java.lang.Class<nn2> r1 = defpackage.nn2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "restore draft"
            defpackage.udd.p(r1, r2, new java.lang.Object[0])
            pae r1 = r0.u()
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.b()
            ru3 r2 = defpackage.ru3.b
            sm2 r3 = new sm2
            r3.<init>(r0, r9)
            kotlinx.coroutines.internal.ContextScope r4 = r0.a
            qod r1 = defpackage.xs7.D(r4, r1, r2, r3)
            k77[] r2 = defpackage.nn2.g1
            r3 = 10
            r2 = r2[r3]
            e3 r3 = r0.W0
            r3.o1(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.onViewCreated(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final void p0() {
        bm3.p(this);
    }

    public final Long r0() {
        return 400L;
    }

    public final void w0() {
        ViewGroup H02 = H0();
        if (M0()) {
            ek8.g(H02, new sy6(0, new up0(4, 2, true), 1), (u16) null);
        }
        az1 x02 = x0();
        if (M0()) {
            ek8.g(x02, new sy6(0, new up0(4, 2, true), 1), (u16) null);
        }
        az1 az1 = (az1) this.P0.T0(this, n1[6]);
        if (M0()) {
            ek8.g(az1, new sy6(0, new up0(1, 2, true), 1), (u16) null);
        }
        az1 K02 = K0();
        if (M0()) {
            ek8.g(K02, new sy6(0, new up0(4, 2, true), 1), (u16) null);
        }
    }

    public final az1 x0() {
        return (az1) this.R0.T0(this, n1[8]);
    }

    public final void y(int i, Bundle bundle) {
        if (i == qhc.H0) {
            if (bundle != null) {
                long j = bundle.getLong("contact_id");
                z0().l(j, true, new i11(j, 3));
            }
        } else if (i == qhc.G0) {
            G0().d();
        } else if (i == qhc.F0) {
            L0().x();
        } else if (i == qhc.E0) {
            nn2 L02 = L0();
            L02.getClass();
            taf.n(L02, (hu3) null, (ru3) null, new mn2(L02, (Continuation) null), 3);
        } else if (i == qhc.D0 && bundle != null) {
            long j2 = bundle.getLong("chat_server_id");
            d34 P1 = ul2.c.P1();
            P1.b(":settings/folder/by-chat?id=" + j2, (Bundle) null);
        }
    }

    public final ax2 y0() {
        return (ax2) this.S0.T0(this, n1[9]);
    }

    public final we1 z0() {
        return (we1) this.j1.getValue();
    }
}
