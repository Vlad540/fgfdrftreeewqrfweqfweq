package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;

/* renamed from: nef  reason: default package */
public final /* synthetic */ class nef implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ WatchTogetherCommandExecutorImpl b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ nef(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, int i) {
        this.a = i;
        this.b = watchTogetherCommandExecutorImpl;
        this.c = u16;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$9(this.b, this.c, jSONObject);
                return;
            case 1:
                WatchTogetherCommandExecutorImpl.pause$lambda$5(this.b, this.c, jSONObject);
                return;
            case 2:
                WatchTogetherCommandExecutorImpl.resume$lambda$7(this.b, this.c, jSONObject);
                return;
            case 3:
                WatchTogetherCommandExecutorImpl.setPosition$lambda$13(this.b, this.c, jSONObject);
                return;
            case 4:
                WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$1(this.b, this.c, jSONObject);
                return;
            case 5:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$11(this.b, this.c, jSONObject);
                return;
            default:
                WatchTogetherCommandExecutorImpl.stop$lambda$3(this.b, this.c, jSONObject);
                return;
        }
    }
}
