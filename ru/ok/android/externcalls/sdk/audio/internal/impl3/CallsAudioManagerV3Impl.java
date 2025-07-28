package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 È\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002È\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0018\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010(\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%H\u0016¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010/J5\u00100\u001a\u00020\u00192\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b0\u00101J=\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u0002022\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b4\u00105J=\u00107\u001a\u00020\u00192\u0006\u00103\u001a\u0002062\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<JE\u0010?\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0019H\u0016¢\u0006\u0004\bA\u0010/J\u0019\u0010C\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0019H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010/J\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\bI\u0010HJ\u001f\u0010J\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bH\u0003¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0019H\u0003¢\u0006\u0004\bL\u0010/J\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0019H\u0003¢\u0006\u0004\bQ\u0010/J\u000f\u0010R\u001a\u00020\u0019H\u0003¢\u0006\u0004\bR\u0010/J\u000f\u0010S\u001a\u00020\u0019H\u0003¢\u0006\u0004\bS\u0010/J\u000f\u0010T\u001a\u00020\u0019H\u0003¢\u0006\u0004\bT\u0010/J\u000f\u0010U\u001a\u00020\u0019H\u0003¢\u0006\u0004\bU\u0010/J\u000f\u0010V\u001a\u00020\u0019H\u0003¢\u0006\u0004\bV\u0010/J\u000f\u0010W\u001a\u00020\u0019H\u0003¢\u0006\u0004\bW\u0010/J\u000f\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010^\u001a\u0004\u0018\u0001022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b`\u0010 J\u0017\u0010b\u001a\u00020\u00192\u0006\u0010a\u001a\u000202H\u0002¢\u0006\u0004\bb\u0010NJ\u0017\u0010c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bc\u0010NJ\u000f\u0010d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bd\u0010/J\u000f\u0010e\u001a\u00020\u0019H\u0002¢\u0006\u0004\be\u0010/J\u000f\u0010f\u001a\u00020\u0019H\u0003¢\u0006\u0004\bf\u0010/J\u0017\u0010i\u001a\u00020\u00192\u0006\u0010h\u001a\u00020gH\u0003¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0019H\u0003¢\u0006\u0004\bk\u0010/J\u000f\u0010l\u001a\u00020\u0019H\u0003¢\u0006\u0004\bl\u0010/J\u000f\u0010m\u001a\u00020\u0019H\u0003¢\u0006\u0004\bm\u0010/J\u000f\u0010n\u001a\u00020\u0019H\u0002¢\u0006\u0004\bn\u0010/J\u000f\u0010o\u001a\u00020\u0019H\u0003¢\u0006\u0004\bo\u0010/JO\u0010r\u001a\u00020\u00192\u0006\u0010p\u001a\u00020X2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0002¢\u0006\u0004\br\u0010sJO\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020X2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0002¢\u0006\u0004\bt\u0010sJ\u0019\u0010u\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u000109H\u0003¢\u0006\u0004\bu\u0010<J\u0017\u0010v\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bv\u0010NJ\u0017\u0010w\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bw\u0010NJ\u0017\u0010y\u001a\u00020\u00192\u0006\u0010x\u001a\u00020\bH\u0003¢\u0006\u0004\by\u0010zJ#\u0010}\u001a\u0002022\b\b\u0002\u0010{\u001a\u00020\b2\b\b\u0002\u0010|\u001a\u00020\bH\u0003¢\u0006\u0004\b}\u0010~J\u000f\u0010\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u0010/J\u0011\u0010\u0001\u001a\u00020\u0019H\u0003¢\u0006\u0005\b\u0001\u0010/J)\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00170\u00010\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0004\u0018\u0001022\u0007\u0010\u0001\u001a\u000206H\u0002¢\u0006\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u0002020\u00018\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R$\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00170¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020g8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0001R\u0019\u0010«\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0001R\u0019\u0010¬\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0001R\u0019\u0010­\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010\u0001R\u0019\u0010®\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010³\u0001R\u0018\u0010µ\u0001\u001a\u00030±\u00018\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R\u0018\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0017\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\"\u0010¹\u0001R\u001e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u0002020\u00018VX\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010\u0001R\u0017\u0010¾\u0001\u001a\u0002028VX\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010¿\u0001\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Â\u0001\u001a\u00020\b8BX\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010À\u0001R\u0017\u0010Ä\u0001\u001a\u00020\b8BX\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010À\u0001R\u001d\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0017*\u0002028BX\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006É\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl;", "Landroid/media/AudioDeviceCallback;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Ljue;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "device", "onCommunicationDeviceChanged", "(Landroid/media/AudioDeviceInfo;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Ls16;Lu16;)V", "onSuccess", "hasBluetoothHeadsetAsync", "(Lu16;Lu16;)V", "hasWiredHeadsetAsync", "notifyBluetoothPermissionGranted", "()V", "releaseAsync", "(Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLs16;Lu16;)V", "requestAudioFocusAsync", "byStopRinging", "updateAvailableDeviceList", "(Z)Z", "maybeSyncAudioDeviceList", "syncAudioDeviceList", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "onCallStateChangedInternal", "setSpeakerEnabled", "(ZZ)V", "startTrackingAudioDevices", "selectAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "setCommunicationDevice", "(Landroid/media/AudioDeviceInfo;)Z", "cancelScheduledTrySetCommunicationDeviceAgain", "scheduleTryToSetCommunicationDeviceAgain", "trySetCommunicationDeviceAgain", "trySetCommunicationDeviceAgainUnsafe", "cancelScheduledSyncWithSystemCommunicationDevice", "scheduleSyncWithSystemCommunicationDevice", "syncWithSystemCommunicationDevice", "", "getAudioManagerStateDetails", "()Ljava/lang/String;", "info", "androidDeviceToString", "(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "getDeviceForAndroidDevice", "(Landroid/media/AudioDeviceInfo;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "handleCurrentCommunicationDevice", "selectedDevice", "applyCurrentDevice", "reportCurrentCallsAudioDevice", "start", "requestAudioFocus", "releaseAudioFocus", "", "mode", "setAudioManagerModeSafe", "(I)V", "release", "rememberUtilizedDeviceType", "maybeRecoverUtilizedDeviceType", "cancelUtilizedDeviceTypeRecovery", "recoverPreviouslyUtilizedDeviceType", "action", "block", "doOnOwnThread", "(Ljava/lang/String;Ls16;Ls16;Lu16;)V", "doOnOwnThreadUnsafe", "setOnAudioDeviceChangeListenerImpl", "setAudioDevice", "reportAudioDeviceOnMainThread", "speakerOn", "updateProximityTrackingState", "(Z)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "savePreviousState", "restorePreviousAudioState", "Lwia;", "mapAndroidDeviceToCallsDevice", "(Landroid/media/AudioDeviceInfo;)Lwia;", "", "getAvailableDevices", "()Ljava/util/List;", "type", "firstOfType", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "isDestroyed", "isStarted", "isInCall", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "workerThreadHandler", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "lastKnownAudioDeviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "", "callsAudioDevices", "Ljava/util/List;", "", "audioDeviceByCallsDevice", "Ljava/util/Map;", "audioDeviceSyncCount", "I", "usedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "reportedAudioDevice", "disabledBluetoothOnce", "disabledSpeakerOnce", "savedPreviousState", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "Ljava/lang/Runnable;", "recoverDeviceByTypeRunnable", "Ljava/lang/Runnable;", "syncWithSystemCommunicationDeviceRunnable", "tryAgainRunnable", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "getAvailableAudioDevices", "availableAudioDevices", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "currentDevice", "isHeadsetConnected", "()Z", "getHasWiredHeadset", "hasWiredHeadset", "getHasEarpiece", "hasEarpiece", "getAudioDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)Landroid/media/AudioDeviceInfo;", "audioDeviceInfo", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
@TargetApi(31)
public final class CallsAudioManagerV3Impl extends AudioDeviceCallback implements CallsAudioManager, AudioManager.OnCommunicationDeviceChangedListener {
    private static final Companion Companion = new Companion((x54) null);
    /* access modifiers changed from: private */
    public static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");
    @Deprecated
    public static final long ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS = 2000;
    @Deprecated
    public static final String TAG = "CallsAudioManagerV3Impl";
    @Deprecated
    public static final long TRY_AGAIN_TIMEOUT_MS = 2000;
    @Deprecated
    public static final long USED_DEVICE_RECOVER_TIMEOUT_MS = 3000;
    private final Map<CallsAudioDeviceInfo, AudioDeviceInfo> audioDeviceByCallsDevice = new LinkedHashMap();
    private final AudioDeviceSelector audioDeviceSelector;
    private int audioDeviceSyncCount;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final HandlerThread backgroundHandlerThread;
    /* access modifiers changed from: private */
    public final List<CallsAudioDeviceInfo> callsAudioDevices = new ArrayList();
    private final CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    /* access modifiers changed from: private */
    public boolean isDestroyed;
    private boolean isInCall;
    private boolean isStarted;
    private CallsAudioManager.AudioDeviceType lastKnownAudioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final Handler mainHandler;
    private CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final ProximityTracker proximityTracker;
    private final Runnable recoverDeviceByTypeRunnable;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.State state;
    private final Runnable syncWithSystemCommunicationDeviceRunnable;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final Runnable tryAgainRunnable;
    /* access modifiers changed from: private */
    public CallsAudioDeviceInfo usedDevice;
    private final VideoTracker videoTracker;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$Companion;", "", "()V", "NO_DEVICE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getNO_DEVICE", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS", "", "TAG", "", "TRY_AGAIN_TIMEOUT_MS", "USED_DEVICE_RECOVER_TIMEOUT_MS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CallsAudioDeviceInfo getNO_DEVICE() {
            return CallsAudioManagerV3Impl.NO_DEVICE;
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State[] r0 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.RINGING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.DIALING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.CONVERSATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.WhenMappings.<clinit>():void");
        }
    }

    public CallsAudioManagerV3Impl(Context context, ProximityTracker proximityTracker2, boolean z, VideoTracker videoTracker2, AudioDeviceSelector audioDeviceSelector2, CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy2, CallsAudioManager.OnMuteListener onMuteListener, Logger logger2) {
        this.proximityTracker = proximityTracker2;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker2;
        this.audioDeviceSelector = audioDeviceSelector2;
        this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy2;
        Logger logger3 = logger2;
        this.logger = logger3;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerV3Thread");
        this.backgroundHandlerThread = handlerThread;
        CallsAudioDeviceInfo.Companion companion = CallsAudioDeviceInfo.Companion;
        this.usedDevice = companion.getNONE();
        this.reportedAudioDevice = companion.getNONE();
        this.recoverDeviceByTypeRunnable = new do1(this, 0);
        this.syncWithSystemCommunicationDeviceRunnable = new do1(this, 1);
        this.tryAgainRunnable = new do1(this, 2);
        this.state = CallsAudioManager.State.IDLE;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mainHandler = handler2;
        Context context2 = context;
        AudioManager audioManager2 = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager2;
        AnonymousClass1 r9 = new s16(this) {
            public final void invoke() {
                ((CallsAudioManagerV3Impl) this.receiver).maybeRecoverUtilizedDeviceType();
            }
        };
        CallsAudioManager.OnMuteListener onMuteListener2 = onMuteListener;
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager2, onMuteListener2, handler2, handler, new s16(this) {
            final /* synthetic */ CallsAudioManagerV3Impl this$0;

            {
                this.this$0 = r1;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isDestroyed);
            }
        }, logger3, new s16(this) {
            public final void invoke() {
                ((CallsAudioManagerV3Impl) this.receiver).rememberUtilizedDeviceType();
            }
        }, r9);
    }

    /* access modifiers changed from: private */
    public final String androidDeviceToString(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return "null";
        }
        try {
            int id = audioDeviceInfo.getId();
            int type = audioDeviceInfo.getType();
            CharSequence productName = audioDeviceInfo.getProductName();
            return id + ":" + type + ":" + productName;
        } catch (Throwable th) {
            return rf0.h("error: ", th.getMessage());
        }
    }

    private final void applyCurrentDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        Logger logger2 = this.logger;
        logger2.d(TAG, "Cancel try again schedule because of used device change to " + callsAudioDeviceInfo);
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.usedDevice = callsAudioDeviceInfo;
        reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
    }

    /* access modifiers changed from: private */
    public final void cancelScheduledSyncWithSystemCommunicationDevice() {
        this.workerThreadHandler.removeCallbacks(this.syncWithSystemCommunicationDeviceRunnable);
    }

    /* access modifiers changed from: private */
    public final void cancelScheduledTrySetCommunicationDeviceAgain() {
        this.workerThreadHandler.removeCallbacks(this.tryAgainRunnable);
    }

    private final void cancelUtilizedDeviceTypeRecovery() {
        Logger logger2 = this.logger;
        CallsAudioManager.AudioDeviceType audioDeviceType = this.lastKnownAudioDeviceType;
        logger2.d(TAG, "Cancelling audio device recovery by type " + audioDeviceType + " (maybe)");
        this.workerThreadHandler.removeCallbacks(this.recoverDeviceByTypeRunnable);
    }

    /* access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            logger2.v(TAG, "requested " + state2);
            onCallStateChangedInternal(state2);
        }
    }

    private final void doOnOwnThread(String str, s16 s16, s16 s162, u16 u16) {
        try {
            doOnOwnThreadUnsafe(str, s16, s162, u16);
        } catch (Throwable th) {
            this.logger.e(TAG, wn6.i("error posting action ", str, " for execution"), th);
        }
    }

    public static /* synthetic */ void doOnOwnThread$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, s16 s16, s16 s162, u16 u16, int i, Object obj) {
        if ((i & 4) != 0) {
            s162 = null;
        }
        if ((i & 8) != 0) {
            u16 = null;
        }
        callsAudioManagerV3Impl.doOnOwnThread(str, s16, s162, u16);
    }

    private final void doOnOwnThreadUnsafe(String str, s16 s16, s16 s162, u16 u16) {
        this.workerThreadHandler.post(new co1(s16, s162, this, str, u16));
    }

    public static /* synthetic */ void doOnOwnThreadUnsafe$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, s16 s16, s16 s162, u16 u16, int i, Object obj) {
        if ((i & 4) != 0) {
            s162 = null;
        }
        if ((i & 8) != 0) {
            u16 = null;
        }
        callsAudioManagerV3Impl.doOnOwnThreadUnsafe(str, s16, s162, u16);
    }

    /* access modifiers changed from: private */
    public static final void doOnOwnThreadUnsafe$lambda$8(s16 s16, s16 s162, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, u16 u16) {
        try {
            s16.invoke();
            if (s162 != null) {
                s162.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "error on executing action ".concat(str), th);
            if (u16 != null) {
                u16.invoke(th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final CallsAudioDeviceInfo firstOfType(CallsAudioManager.AudioDeviceType audioDeviceType) {
        T t;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((CallsAudioDeviceInfo) t).getDeviceType() == audioDeviceType) {
                break;
            }
        }
        return (CallsAudioDeviceInfo) t;
    }

    private final AudioDeviceInfo getAudioDeviceInfo(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return this.audioDeviceByCallsDevice.get(callsAudioDeviceInfo);
    }

    private final String getAudioManagerStateDetails() {
        try {
            return o23.c0(p20.p(this.audioManager), ",", (String) null, (String) null, new CallsAudioManagerV3Impl$getAudioManagerStateDetails$1(this), 30);
        } catch (Throwable th) {
            return rf0.h("audio manager error: ", th.getMessage());
        }
    }

    private final List<wia> getAvailableDevices() {
        List<AudioDeviceInfo> p = p20.p(this.audioManager);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo mapAndroidDeviceToCallsDevice : p) {
            wia mapAndroidDeviceToCallsDevice2 = mapAndroidDeviceToCallsDevice(mapAndroidDeviceToCallsDevice);
            if (mapAndroidDeviceToCallsDevice2 != null) {
                arrayList.add(mapAndroidDeviceToCallsDevice2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final CallsAudioDeviceInfo getDeviceForAndroidDevice(AudioDeviceInfo audioDeviceInfo) {
        T t;
        T t2;
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "NULL device mapped to null");
            return null;
        }
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (hhd.f(getAudioDeviceInfo((CallsAudioDeviceInfo) t), audioDeviceInfo)) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) t;
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "Not having a mirror for current communication device");
            syncAudioDeviceList();
            Iterator<T> it2 = this.callsAudioDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it2.next();
                if (hhd.f(getAudioDeviceInfo((CallsAudioDeviceInfo) t2), audioDeviceInfo)) {
                    break;
                }
            }
            callsAudioDeviceInfo = (CallsAudioDeviceInfo) t2;
        }
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "After double-check still not having a mirror for current communication device");
            return null;
        }
        Logger logger2 = this.logger;
        int id = audioDeviceInfo.getId();
        int type = audioDeviceInfo.getType();
        CharSequence productName = audioDeviceInfo.getProductName();
        StringBuilder i = rf0.i("Device ", id, ":", type, ":");
        i.append(productName);
        i.append(" mirrored to ");
        i.append(callsAudioDeviceInfo);
        logger2.d(TAG, i.toString());
        return callsAudioDeviceInfo;
    }

    private final boolean getHasEarpiece() {
        return firstOfType(CallsAudioManager.AudioDeviceType.EARPIECE) != null;
    }

    private final boolean getHasWiredHeadset() {
        return firstOfType(CallsAudioManager.AudioDeviceType.WIRED_HEADSET) != null;
    }

    private final CallsAudioDeviceInfo getPreferredAudioDevice(boolean z, boolean z2) {
        maybeSyncAudioDeviceList();
        AudioDeviceSelector audioDeviceSelector2 = this.audioDeviceSelector;
        CallsAudioManager.State state2 = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean hasEarpiece = getHasEarpiece();
        boolean z3 = this.disabledSpeakerOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        boolean z4 = this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (CallsAudioDeviceInfo deviceType : list) {
            arrayList.add(deviceType.getDeviceType());
        }
        CallsAudioDeviceInfo firstOfType = firstOfType(audioDeviceSelector2.selectPreferableDevice(state2, z, z2, hasWiredHeadset, hasEarpiece, z3, z4, o23.w0(arrayList), this.usedDevice.getDeviceType(), this.videoTracker, this.proximityTracker));
        return firstOfType == null ? CallsAudioDeviceInfo.Companion.getNONE() : firstOfType;
    }

    public static /* synthetic */ CallsAudioDeviceInfo getPreferredAudioDevice$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV3Impl.getPreferredAudioDevice(z, z2);
    }

    /* access modifiers changed from: private */
    public final void handleCurrentCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo deviceForAndroidDevice = getDeviceForAndroidDevice(audioDeviceInfo);
        if (deviceForAndroidDevice != null) {
            Logger logger2 = this.logger;
            logger2.d(TAG, "Apply device " + deviceForAndroidDevice + " confirmed by system");
            applyCurrentDevice(deviceForAndroidDevice);
        }
    }

    private final wia mapAndroidDeviceToCallsDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo callsAudioDeviceInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String obj;
        String obj2;
        String str5;
        String obj3;
        int type = audioDeviceInfo.getType();
        if (type == 1) {
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CharSequence productName = audioDeviceInfo.getProductName();
            if (productName == null || (str = productName.toString()) == null) {
                str = CallsAudioDeviceInfo.EARPIECE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType, str);
        } else if (type == 2) {
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            CharSequence productName2 = audioDeviceInfo.getProductName();
            if (productName2 == null || (str2 = productName2.toString()) == null) {
                str2 = CallsAudioDeviceInfo.SPEAKERPHONE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType2, str2);
        } else if (type == 3) {
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName3 = audioDeviceInfo.getProductName();
            if (productName3 == null || (str3 = productName3.toString()) == null) {
                str3 = CallsAudioDeviceInfo.WIRED_HEADSET;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType3, str3);
        } else if (type != 4) {
            String str6 = CallsAudioDeviceInfo.BLUETOOTH;
            if (type == 7) {
                CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName4 = audioDeviceInfo.getProductName();
                if (!(productName4 == null || (obj = productName4.toString()) == null)) {
                    str6 = obj;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType4, str6);
            } else if (type == 8) {
                CallsAudioManager.AudioDeviceType audioDeviceType5 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName5 = audioDeviceInfo.getProductName();
                if (!(productName5 == null || (obj2 = productName5.toString()) == null)) {
                    str6 = obj2;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType5, str6);
            } else if (type == 22) {
                CallsAudioManager.AudioDeviceType audioDeviceType6 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
                CharSequence productName6 = audioDeviceInfo.getProductName();
                if (productName6 == null || (str5 = productName6.toString()) == null) {
                    str5 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType6, str5);
            } else if (type != 26) {
                Logger logger2 = this.logger;
                int type2 = audioDeviceInfo.getType();
                CharSequence productName7 = audioDeviceInfo.getProductName();
                logger2.d(TAG, "Unknown available audio device " + type2 + ":" + productName7);
                callsAudioDeviceInfo = null;
            } else {
                CallsAudioManager.AudioDeviceType audioDeviceType7 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName8 = audioDeviceInfo.getProductName();
                if (!(productName8 == null || (obj3 = productName8.toString()) == null)) {
                    str6 = obj3;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType7, str6);
            }
        } else {
            CallsAudioManager.AudioDeviceType audioDeviceType8 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName9 = audioDeviceInfo.getProductName();
            if (productName9 == null || (str4 = productName9.toString()) == null) {
                str4 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType8, str4);
        }
        Logger logger3 = this.logger;
        int id = audioDeviceInfo.getId();
        int type3 = audioDeviceInfo.getType();
        CharSequence productName10 = audioDeviceInfo.getProductName();
        StringBuilder i = rf0.i("Map ", id, ":", type3, ":");
        i.append(productName10);
        i.append(" -> ");
        i.append(callsAudioDeviceInfo);
        logger3.d(TAG, i.toString());
        if (callsAudioDeviceInfo != null) {
            return new wia(callsAudioDeviceInfo, audioDeviceInfo);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void maybeRecoverUtilizedDeviceType() {
        if (this.lastKnownAudioDeviceType == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Previously used device type is not known, will not try to recover");
        }
        if (this.usedDevice.getDeviceType() == this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "Used device type matches type of device used before audio focus was lost. Nothing to do here");
            return;
        }
        this.logger.d(TAG, "Schedule previously utilized device recovery in 3000 ms");
        try {
            this.workerThreadHandler.postDelayed(this.recoverDeviceByTypeRunnable, USED_DEVICE_RECOVER_TIMEOUT_MS);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post recovery runnable", th);
        }
    }

    private final void maybeSyncAudioDeviceList() {
        if (this.audioDeviceSyncCount <= 0) {
            syncAudioDeviceList();
        }
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            boolean z = false;
            boolean z2 = this.state == CallsAudioManager.State.RINGING && state2 == CallsAudioManager.State.CONVERSATION;
            if (state2 == CallsAudioManager.State.CONVERSATION) {
                z = true;
            }
            this.isInCall = z;
            this.state = state2;
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                release();
            } else if (i == 2 || i == 3 || i == 4) {
                start();
                if (z2) {
                    updateAvailableDeviceList(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void recoverDeviceByTypeRunnable$lambda$0(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            callsAudioManagerV3Impl.recoverPreviouslyUtilizedDeviceType();
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Error on device recovery", th);
        }
    }

    private final void recoverPreviouslyUtilizedDeviceType() {
        if (!this.isDestroyed) {
            if (this.usedDevice.getDeviceType() != this.lastKnownAudioDeviceType) {
                this.logger.d(TAG, "It seems previously used device has been recovered by system. Nothing to do here");
            } else if (updateAvailableDeviceList$default(this, false, 1, (Object) null)) {
                this.logger.d(TAG, "It seems better option was found during device list update. Keep it as it is");
            } else {
                CallsAudioDeviceInfo firstOfType = firstOfType(this.lastKnownAudioDeviceType);
                if (firstOfType == null) {
                    Logger logger2 = this.logger;
                    CallsAudioManager.AudioDeviceType audioDeviceType = this.lastKnownAudioDeviceType;
                    logger2.d(TAG, "No device found by requested type " + audioDeviceType);
                    return;
                }
                Logger logger3 = this.logger;
                logger3.d(TAG, "Submitting request to select " + firstOfType + " as current (recovery)");
                selectAudioDevice(firstOfType);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            this.logger.d(TAG, "Already released, ignore");
            return;
        }
        this.isDestroyed = true;
        AudioManager audioManager2 = this.audioManager;
        audioManager2.unregisterAudioDeviceCallback(this);
        try {
            p20.u(audioManager2, p20.h(this));
        } catch (IllegalArgumentException unused) {
        }
        p20.r(audioManager2);
        this.logger.d(TAG, "Audio manager cleanup completed");
        releaseAudioFocus();
        restorePreviousAudioState();
        this.backgroundHandlerThread.quit();
        this.logger.d(TAG, "Release completed");
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* access modifiers changed from: private */
    public final void rememberUtilizedDeviceType() {
        cancelUtilizedDeviceTypeRecovery();
        this.lastKnownAudioDeviceType = this.usedDevice.getDeviceType();
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.mainHandler.post(new g5((Object) this, (Object) callsAudioDeviceInfo, (Object) this.onAudioDeviceChangeListener, 11));
    }

    /* access modifiers changed from: private */
    public static final void reportAudioDeviceOnMainThread$lambda$9(CallsAudioManagerV3Impl callsAudioManagerV3Impl, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (hhd.f(callsAudioManagerV3Impl.reportedAudioDevice, callsAudioDeviceInfo) || onAudioDeviceInfoChangeListener == null) {
            Logger logger2 = callsAudioManagerV3Impl.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = callsAudioManagerV3Impl.reportedAudioDevice;
            boolean f = hhd.f(callsAudioDeviceInfo2, callsAudioDeviceInfo);
            boolean z = onAudioDeviceInfoChangeListener != null;
            logger2.d(TAG, "Will not report audio device change from " + callsAudioDeviceInfo2 + " to " + callsAudioDeviceInfo + " because of same device=" + f + ", has listener=" + z);
            return;
        }
        Logger logger3 = callsAudioManagerV3Impl.logger;
        CallsAudioDeviceInfo callsAudioDeviceInfo3 = callsAudioManagerV3Impl.reportedAudioDevice;
        logger3.v(TAG, "reporting device change " + callsAudioDeviceInfo3 + " -> " + callsAudioDeviceInfo);
        onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(callsAudioManagerV3Impl.reportedAudioDevice, callsAudioDeviceInfo));
        callsAudioManagerV3Impl.reportedAudioDevice = callsAudioDeviceInfo;
    }

    private final void reportCurrentCallsAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        reportAudioDeviceOnMainThread(callsAudioDeviceInfo);
        updateProximityTrackingState(callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    }

    /* access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        Object obj;
        if (this.savedPreviousState) {
            this.logger.v(TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager2 = this.audioManager;
                if (this.savedIsSpeakerPhoneOn) {
                    Iterator it = p20.p(audioManager2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((AudioDeviceInfo) obj).getType() == 2) {
                            break;
                        }
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo != null) {
                        p20.t(audioManager2, audioDeviceInfo);
                    }
                }
                audioManager2.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.e(TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (!this.savedPreviousState) {
            this.logger.v(TAG, "saving state");
            try {
                AudioManager audioManager2 = this.audioManager;
                this.savedIsMicrophoneMute = audioManager2.isMicrophoneMute();
                AudioDeviceInfo g = p20.g(audioManager2);
                boolean z = false;
                if (g != null && g.getType() == 2) {
                    z = true;
                }
                this.savedIsSpeakerPhoneOn = z;
                this.savedPreviousState = true;
            } catch (Exception e) {
                this.logger.e(TAG, "savePreviousState: failed", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void scheduleSyncWithSystemCommunicationDevice() {
        if (!this.isDestroyed) {
            cancelScheduledSyncWithSystemCommunicationDevice();
            try {
                this.workerThreadHandler.postDelayed(this.syncWithSystemCommunicationDeviceRunnable, 2000);
            } catch (Throwable th) {
                this.logger.d(TAG, "Can't schedule sync with system communication device", th);
            }
        }
    }

    private final void scheduleTryToSetCommunicationDeviceAgain() {
        if (!this.isDestroyed) {
            cancelScheduledTrySetCommunicationDeviceAgain();
            this.logger.d(TAG, "Schedule try again with current device in 2000ms");
            try {
                this.workerThreadHandler.postDelayed(this.tryAgainRunnable, 2000);
            } catch (Throwable th) {
                this.logger.e(TAG, "Unable to post try again runnable", th);
            }
        }
    }

    private final void selectAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        cancelUtilizedDeviceTypeRecovery();
        Logger logger2 = this.logger;
        logger2.d(TAG, "Selecting " + callsAudioDeviceInfo);
        if (hhd.f(this.usedDevice, callsAudioDeviceInfo)) {
            Logger logger3 = this.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = this.usedDevice;
            logger3.d(TAG, "An attempt to select same device " + callsAudioDeviceInfo2 + ", ignore");
            return;
        }
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(callsAudioDeviceInfo);
        if (audioDeviceInfo == null) {
            Logger logger4 = this.logger;
            logger4.d(TAG, "No known android device matches requested device " + callsAudioDeviceInfo);
            p20.r(this.audioManager);
        } else if (callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Empty device type, clear communication device");
            p20.r(this.audioManager);
            reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
        } else if (audioDeviceInfo.equals(p20.g(this.audioManager))) {
            Logger logger5 = this.logger;
            logger5.d(TAG, "Device " + callsAudioDeviceInfo + " mapped to currently used communication device");
            handleCurrentCommunicationDevice(audioDeviceInfo);
        } else {
            Logger logger6 = this.logger;
            logger6.d(TAG, "Submit request to set current communication device to " + callsAudioDeviceInfo);
            try {
                Logger logger7 = this.logger;
                logger7.d(TAG, "Apply device " + callsAudioDeviceInfo + " by user request (just a promise to use)");
                applyCurrentDevice(callsAudioDeviceInfo);
                if (!setCommunicationDevice(audioDeviceInfo)) {
                    Logger logger8 = this.logger;
                    String androidDeviceToString = androidDeviceToString(audioDeviceInfo);
                    logger8.d(TAG, "Can't set " + androidDeviceToString + ": setCommunicationDevice() returned false");
                    syncWithSystemCommunicationDevice();
                }
            } catch (Throwable th) {
                Logger logger9 = this.logger;
                String androidDeviceToString2 = androidDeviceToString(audioDeviceInfo);
                String audioManagerStateDetails = getAudioManagerStateDetails();
                logger9.e(TAG, "Error setting communication device", new IllegalArgumentException("Proposed device was not able to set as current " + callsAudioDeviceInfo + " (" + androidDeviceToString2 + "), details: " + audioManagerStateDetails, th));
                syncWithSystemCommunicationDevice();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.AudioDeviceType deviceType;
        if (!this.isDestroyed && (deviceType = this.usedDevice.getDeviceType()) != callsAudioDeviceInfo.getDeviceType()) {
            boolean z = this.disabledBluetoothOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
            boolean z2 = false;
            this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
            boolean z3 = this.disabledSpeakerOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (deviceType == audioDeviceType2) {
                z2 = true;
            }
            this.disabledSpeakerOnce = z3 | z2;
            this.logger.d(TAG, "Set audio device by external request: " + callsAudioDeviceInfo);
            if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
                selectAudioDevice(callsAudioDeviceInfo);
            }
        }
    }

    private final void setAudioManagerModeSafe(int i) {
        try {
            this.audioManager.setMode(i);
        } catch (Throwable th) {
            this.logger.reportError(TAG, "Can't set audio manager mode", th);
        }
    }

    private final boolean setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            p20.r(this.audioManager);
            return true;
        } else if (!p20.w(this.audioManager, audioDeviceInfo)) {
            return false;
        } else {
            scheduleTryToSetCommunicationDeviceAgain();
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (!this.isDestroyed) {
            this.onAudioDeviceChangeListener = onAudioDeviceInfoChangeListener;
            if (onAudioDeviceInfoChangeListener != null) {
                this.reportedAudioDevice = NO_DEVICE;
                reportAudioDeviceOnMainThread(this.usedDevice);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setSpeakerEnabled(boolean z, boolean z2) {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            logger2.v(TAG, "requested speaker " + z + " (" + z2 + ")");
            if (!z) {
                selectAudioDevice(getPreferredAudioDevice(true, false));
            } else if (z2 || !this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
                CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
                CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
                CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
                if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                    CallsAudioDeviceInfo firstOfType = firstOfType(audioDeviceType2);
                    if (firstOfType != null) {
                        selectAudioDevice(firstOfType);
                    } else {
                        this.logger.e(TAG, "No speaker found");
                    }
                }
            }
        }
    }

    private final void start() {
        if (this.isStarted) {
            this.logger.d(TAG, "Already started, ignore");
            return;
        }
        this.logger.d(TAG, "Starting...");
        this.isStarted = true;
        savePreviousState();
        requestAudioFocus();
        startTrackingAudioDevices();
        setAudioManagerModeSafe(3);
        selectAudioDevice(getPreferredAudioDevice(true, false));
    }

    private final void startTrackingAudioDevices() {
        AudioManager audioManager2 = this.audioManager;
        audioManager2.registerAudioDeviceCallback(this, this.workerThreadHandler);
        p20.s(audioManager2, new eo1(0, this), p20.h(this));
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl, Runnable runnable) {
        callsAudioManagerV3Impl.workerThreadHandler.post(runnable);
    }

    private final void syncAudioDeviceList() {
        Logger logger2 = this.logger;
        int i = this.audioDeviceSyncCount;
        String c0 = o23.c0(this.callsAudioDevices, (String) null, (String) null, (String) null, CallsAudioManagerV3Impl$syncAudioDeviceList$1.INSTANCE, 31);
        logger2.d(TAG, " Sync audio device list (" + i + "). List before update: " + c0);
        this.callsAudioDevices.clear();
        this.audioDeviceByCallsDevice.clear();
        try {
            List<wia> availableDevices = getAvailableDevices();
            List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
            ArrayList arrayList = new ArrayList(q23.H(availableDevices, 10));
            for (wia wia : availableDevices) {
                arrayList.add((CallsAudioDeviceInfo) wia.a);
            }
            list.addAll(arrayList);
            ju7.U(availableDevices, this.audioDeviceByCallsDevice);
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while getting available communication devices", th);
        }
        Logger logger3 = this.logger;
        int i2 = this.audioDeviceSyncCount;
        String c02 = o23.c0(this.callsAudioDevices, (String) null, (String) null, (String) null, CallsAudioManagerV3Impl$syncAudioDeviceList$3.INSTANCE, 31);
        logger3.d(TAG, " Sync audio device list (" + i2 + "). List after update: " + c02);
        this.audioDeviceSyncCount = this.audioDeviceSyncCount + 1;
    }

    /* access modifiers changed from: private */
    public final void syncWithSystemCommunicationDevice() {
        if (!this.isDestroyed) {
            this.logger.d(TAG, "Try to recover actual device audio device state");
            try {
                handleCurrentCommunicationDevice(p20.g(this.audioManager));
            } catch (Throwable unused) {
                this.logger.e(TAG, "Can't recover current communication device from system state");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void trySetCommunicationDeviceAgain() {
        try {
            trySetCommunicationDeviceAgainUnsafe();
        } catch (Throwable th) {
            this.logger.e(TAG, "Failed to set communication device again", th);
            syncWithSystemCommunicationDevice();
        }
    }

    private final void trySetCommunicationDeviceAgainUnsafe() {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            String androidDeviceToString = androidDeviceToString(getAudioDeviceInfo(this.usedDevice));
            logger2.d(TAG, "Try again with " + androidDeviceToString);
            p20.r(this.audioManager);
            AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(this.usedDevice);
            if (audioDeviceInfo == null) {
                this.logger.d(TAG, "No current device, ignore try again attempt, sync with system device instead");
                syncWithSystemCommunicationDevice();
            } else if (!p20.w(this.audioManager, audioDeviceInfo)) {
                Logger logger3 = this.logger;
                String androidDeviceToString2 = androidDeviceToString(audioDeviceInfo);
                logger3.d(TAG, "Try again with " + androidDeviceToString2 + " did fail. Sync with system device immediately");
                syncWithSystemCommunicationDevice();
            } else {
                Logger logger4 = this.logger;
                String androidDeviceToString3 = androidDeviceToString(audioDeviceInfo);
                logger4.d(TAG, "Try again with " + androidDeviceToString3 + " passed, wait for a system confirmation or rollback in 2000ms");
                scheduleSyncWithSystemCommunicationDevice();
            }
        }
    }

    private final boolean updateAvailableDeviceList(boolean z) {
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        boolean z2 = firstOfType(audioDeviceType) != null;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        boolean z3 = firstOfType(audioDeviceType2) != null;
        Logger logger2 = this.logger;
        logger2.d(TAG, "update audio device list, had bt before=" + z3 + ", had headphones before=" + z2);
        syncAudioDeviceList();
        T t = null;
        CallsAudioDeviceInfo firstOfType = !z2 ? firstOfType(audioDeviceType) : null;
        CallsAudioDeviceInfo firstOfType2 = !z3 ? firstOfType(audioDeviceType2) : null;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (hhd.f((CallsAudioDeviceInfo) next, this.usedDevice)) {
                t = next;
                break;
            }
        }
        if (t == null || z) {
            CallsAudioDeviceInfo preferredAudioDevice = getPreferredAudioDevice(true, !z);
            Logger logger3 = this.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
            logger3.d(TAG, "Current device " + callsAudioDeviceInfo + " disappeared, select " + preferredAudioDevice + " instead");
            selectAudioDevice(preferredAudioDevice);
        } else if (firstOfType != null && this.usedDevice.getDeviceType() != CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
            Logger logger4 = this.logger;
            logger4.d(TAG, "Wired headset did appear: " + firstOfType + ", let us try to select it");
            selectAudioDevice(firstOfType);
            return true;
        } else if (firstOfType2 != null && !this.usedDevice.getDeviceType().isHeadsetDevice()) {
            if (!this.disabledBluetoothOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) {
                Logger logger5 = this.logger;
                logger5.d(TAG, "Bluetooth headset did appear: " + firstOfType2 + ", let us try to select it");
                selectAudioDevice(firstOfType2);
                return true;
            }
            this.logger.d(TAG, "Will not try to select bluetooth because user disable it once already");
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean updateAvailableDeviceList$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return callsAudioManagerV3Impl.updateAvailableDeviceList(z);
    }

    private final void updateProximityTrackingState(boolean z) {
        boolean z2 = this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || (z && !this.trackProximityWhenSpeakerEnabled);
        Logger logger2 = this.logger;
        logger2.v(TAG, "proximity disabled? " + z2 + ", speaker? " + z);
        this.mainHandler.post(new t50(z2, this, 4));
    }

    /* access modifiers changed from: private */
    public static final void updateProximityTrackingState$lambda$10(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        if (z) {
            try {
                callsAudioManagerV3Impl.proximityTracker.stopTrackingProximity();
            } catch (Throwable th) {
                callsAudioManagerV3Impl.logger.e(TAG, "Proximity tracker error", th);
            }
        } else {
            callsAudioManagerV3Impl.proximityTracker.startTrackingProximity();
        }
    }

    public void changeStateAsync(CallsAudioManager.State state2, s16 s16, u16 u16) {
        doOnOwnThread("changeStateAsync", new CallsAudioManagerV3Impl$changeStateAsync$1(this, state2), s16, u16);
    }

    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return this.callsAudioDevices;
    }

    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.usedDevice;
    }

    public void hasBluetoothHeadsetAsync(u16 u16, u16 u162) {
        doOnOwnThread("hasBluetoothHeadsetAsync", new CallsAudioManagerV3Impl$hasBluetoothHeadsetAsync$1(u16, this), (s16) null, u162);
    }

    public void hasWiredHeadsetAsync(u16 u16, u16 u162) {
        doOnOwnThread("hasWiredHeadsetAsync", new CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1(u16, this), (s16) null, u162);
    }

    public boolean isHeadsetConnected() {
        return this.usedDevice.getDeviceType().isHeadsetDevice();
    }

    public void notifyBluetoothPermissionGranted() {
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were added, update list");
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were removed, update list");
        updateAvailableDeviceList$default(this, false, 1, (Object) null);
    }

    public void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        doOnOwnThread$default(this, "onCommunicationDeviceChanged", new CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1(this, audioDeviceInfo), (s16) null, (u16) null, 12, (Object) null);
    }

    public void releaseAsync(s16 s16, u16 u16) {
        doOnOwnThread("releaseAsync", new CallsAudioManagerV3Impl$releaseAsync$1(this), s16, u16);
    }

    public void requestAudioFocusAsync() {
        doOnOwnThread("requestAudioFocus", new CallsAudioManagerV3Impl$requestAudioFocusAsync$1(this), new CallsAudioManagerV3Impl$requestAudioFocusAsync$2(this), new CallsAudioManagerV3Impl$requestAudioFocusAsync$3(this));
    }

    public void setAudioDeviceAsync(CallsAudioDeviceInfo callsAudioDeviceInfo, s16 s16, u16 u16) {
        doOnOwnThread("setAudioDeviceAsync", new CallsAudioManagerV3Impl$setAudioDeviceAsync$1(this, callsAudioDeviceInfo), s16, u16);
    }

    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDeviceType, s16 s16, u16 u16) {
        doOnOwnThread("setAudioDeviceAsync", new CallsAudioManagerV3Impl$setAudioDeviceTypeAsync$1(this, audioDeviceType), s16, u16);
    }

    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        doOnOwnThread$default(this, "setOnAudioDeviceChangeListener", new CallsAudioManagerV3Impl$setOnAudioDeviceChangeListener$1(this, onAudioDeviceInfoChangeListener), (s16) null, (u16) null, 12, (Object) null);
    }

    public void setSpeakerEnabledAsync(boolean z, boolean z2, s16 s16, u16 u16) {
        doOnOwnThread("setSpeakerEnabledAsync", new CallsAudioManagerV3Impl$setSpeakerEnabledAsync$1(this, z, z2), s16, u16);
    }
}
