package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: qu8  reason: default package */
public final /* synthetic */ class qu8 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ qu8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final Object invoke(Object obj) {
        CharSequence charSequence;
        boolean z = false;
        MessageWriteWidget messageWriteWidget = this.b;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                CharSequence charSequence2 = (CharSequence) obj;
                k77[] k77Arr = MessageWriteWidget.J0;
                if (charSequence2 != null) {
                    int length = charSequence2.length() - 1;
                    int i = 0;
                    boolean z2 = false;
                    while (i <= length) {
                        boolean z3 = hhd.o(charSequence2.charAt(!z2 ? i : length), 32) <= 0;
                        if (!z2) {
                            if (!z3) {
                                z2 = true;
                            } else {
                                i++;
                            }
                        } else if (!z3) {
                            charSequence = charSequence2.subSequence(i, length + 1);
                        } else {
                            length--;
                        }
                    }
                    charSequence = charSequence2.subSequence(i, length + 1);
                } else {
                    charSequence = null;
                }
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if ((!z) && charSequence2 != null && h0e.d0(charSequence2) == 10) {
                    messageWriteWidget.z0();
                }
                return jue;
            case 1:
                k77[] k77Arr2 = MessageWriteWidget.J0;
                tu7 tu7 = new tu7((EditText) obj, new c9(16, messageWriteWidget));
                messageWriteWidget.E0 = tu7;
                return tu7;
            case 2:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr3 = MessageWriteWidget.J0;
                qu8 qu8 = new qu8(messageWriteWidget, 5);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(y9a.w);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                qu8.invoke(frameLayout);
                linearLayout.addView(frameLayout);
                return jue;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k77[] k77Arr4 = MessageWriteWidget.J0;
                if (booleanValue) {
                    nu8.z(messageWriteWidget.u0(), 2, 2);
                }
                return jue;
            case 4:
                k77[] k77Arr5 = MessageWriteWidget.J0;
                nu8 u0 = messageWriteWidget.u0();
                u0.getClass();
                taf.o(u0.D0, new xt8((Uri) obj));
                return jue;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                k77[] k77Arr6 = MessageWriteWidget.J0;
                jq8 jq8 = new jq8(viewGroup.getContext());
                Context context = jq8.getContext();
                MessageWriteWidget messageWriteWidget2 = this.b;
                s16 s16 = r12;
                s16 z8Var = new z8(0, 0, nu8.class, messageWriteWidget2.u0(), "onEmojiClick", "onEmojiClick(ZZ)V");
                GestureDetector gestureDetector = new GestureDetector(context, new h76(1, s16));
                gestureDetector.setIsLongpressEnabled(false);
                jq8.setLeftInnerIconTouchListener(new cg3(gestureDetector, 6));
                jq8.setRightInnerIconVisible(true);
                GestureDetector gestureDetector2 = new GestureDetector(jq8.getContext(), new h76(1, new e78(0, messageWriteWidget2, MessageWriteWidget.class, "onClickAttachPicker", "onClickAttachPicker()V", 0, 1)));
                gestureDetector2.setIsLongpressEnabled(false);
                jq8.setRightInnerIconTouchListener(new cg3(gestureDetector2, 6));
                jq8.setRightOuterIconTouchListener(new wd1(new h87(1, messageWriteWidget2, MessageWriteWidget.class, "onTouch", "onTouch(Landroid/view/MotionEvent;)V", 0, 5), 2, new GestureDetector(jq8.getContext(), new g33(new e78(0, messageWriteWidget2, MessageWriteWidget.class, "onRightOuterIconClick", "onRightOuterIconClick()V", 0, 2), 3, new e78(0, messageWriteWidget2, MessageWriteWidget.class, "onSendLongClick", "onSendLongClick()V", 0, 3)))));
                jq8.setVideoMessageEnabled(((kb5) ((jb5) messageWriteWidget2.Z.getValue())).u());
                jq8.setVideoMessageTouchListener(new jg1(3, messageWriteWidget2));
                if (((Boolean) messageWriteWidget2.x0.getValue()).booleanValue()) {
                    jq8.c.addTextChangedListener(new ae1(new qu8(messageWriteWidget2, 0), 7, jq8));
                }
                jq8.setInputKeyListener(new ru8(0, messageWriteWidget2));
                jq8.setCustomSelectionActionModeCallback(new qu8(messageWriteWidget2, 1));
                viewGroup.addView(jq8);
                FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
                frameLayout2.setId(y9a.x);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                frameLayout2.setLayoutParams(layoutParams);
                frameLayout2.setBackgroundColor(0);
                viewGroup.addView(frameLayout2);
                return jue;
        }
    }
}
