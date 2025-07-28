package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.List;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends x26 implements i26 {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, 0, StereoRoomManagerImpl.class, obj, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<ge1>) (List) obj, (s16) obj2);
        return jue.a;
    }

    public final void invoke(List<ge1> list, s16 s16) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, s16);
    }
}
