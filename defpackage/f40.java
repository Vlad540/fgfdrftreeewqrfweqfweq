package defpackage;

import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: f40  reason: default package */
public final /* synthetic */ class f40 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioListenView b;

    public /* synthetic */ f40(AudioListenView audioListenView, int i) {
        this.a = i;
        this.b = audioListenView;
    }

    public final Object invoke() {
        AudioListenView audioListenView = this.b;
        switch (this.a) {
            case 0:
                int i = AudioListenView.F0;
                return gq3.b(audioListenView.getContext(), phc.H1);
            case 1:
                int i2 = AudioListenView.F0;
                return gq3.b(audioListenView.getContext(), phc.w1);
            case 2:
                int i3 = AudioListenView.F0;
                return gq3.b(audioListenView.getContext(), phc.T0);
            default:
                return AudioListenView.c(audioListenView);
        }
    }
}
