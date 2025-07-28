package defpackage;

import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: u6f  reason: default package */
public final /* synthetic */ class u6f implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ u6f(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke() {
        VideoMessageWidget videoMessageWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = VideoMessageWidget.y0;
                return gq3.b(videoMessageWidget.getContext(), phc.O);
            default:
                k77[] k77Arr2 = VideoMessageWidget.y0;
                return gq3.b(videoMessageWidget.getContext(), phc.N);
        }
    }
}
