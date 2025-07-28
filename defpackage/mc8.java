package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: mc8  reason: default package */
public final class mc8 extends MediaSession.Callback {
    public final /* synthetic */ m18 a;

    public mc8(m18 m18) {
        this.a = m18;
    }

    public final pc8 a() {
        pc8 pc8;
        synchronized (this.a.a) {
            pc8 = (pc8) ((WeakReference) this.a.c).get();
        }
        if (pc8 == null || this.a != pc8.getCallback()) {
            return null;
        }
        return pc8;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        i1f i1f;
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            try {
                if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                    if (resultReceiver != null) {
                        Bundle bundle2 = new Bundle();
                        uc8 uc8 = a2.c;
                        mn6 a3 = uc8.a();
                        bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, a3 == null ? null : a3.asBinder());
                        synchronized (uc8.a) {
                            i1f = uc8.o;
                        }
                        fja.x(bundle2, i1f);
                        resultReceiver.send(0, bundle2);
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.f((c58) wa7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), c58.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                    if (bundle != null) {
                        this.a.g((c58) wa7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), c58.CREATOR), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.u((c58) wa7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), c58.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                    List list = a2.h;
                    if (!(list == null || bundle == null)) {
                        int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                        sc8 sc8 = (i < 0 || i >= list.size()) ? null : (sc8) list.get(i);
                        if (sc8 != null) {
                            this.a.u(sc8.a);
                        }
                    }
                } else {
                    this.a.h(str, bundle, resultReceiver);
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((pd8) null);
        }
    }

    public final void onCustomAction(String str, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            try {
                boolean equals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
                m18 m18 = this.a;
                if (equals) {
                    if (bundle != null) {
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        vc8.a(bundle2);
                        m18.p((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                    m18.q();
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                    if (bundle != null) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        vc8.a(bundle3);
                        m18.r(string, bundle3);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    if (bundle != null) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        vc8.a(bundle4);
                        m18.s(string2, bundle4);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                    if (bundle != null) {
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        vc8.a(bundle5);
                        m18.t((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle5);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    if (bundle != null) {
                        bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                        m18.getClass();
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                    if (bundle != null) {
                        m18.A(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                    if (bundle != null) {
                        m18.B(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                    if (bundle != null) {
                        vc8.a(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        m18.z((dyb) wa7.a(bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), dyb.CREATOR));
                    }
                } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                    m18.i(str, bundle);
                } else if (bundle != null) {
                    m18.x(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((pd8) null);
        }
    }

    public final void onFastForward() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.j();
            a2.a((pd8) null);
        }
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        pc8 a2 = a();
        if (a2 == null) {
            return false;
        }
        boolean k = this.a.k(intent);
        a2.a((pd8) null);
        return k || super.onMediaButtonEvent(intent);
    }

    public final void onPause() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.l();
            a2.a((pd8) null);
        }
    }

    public final void onPlay() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.m();
            a2.a((pd8) null);
        }
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.n(str, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.o(str, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.p(uri, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onPrepare() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.q();
            a2.a((pd8) null);
        }
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.r(str, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.s(str, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        pc8 a2 = a();
        if (a2 != null) {
            vc8.a(bundle);
            this.a.t(uri, bundle);
            a2.a((pd8) null);
        }
    }

    public final void onRewind() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.v();
            a2.a((pd8) null);
        }
    }

    public final void onSeekTo(long j) {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.w(j);
            a2.a((pd8) null);
        }
    }

    public final void onSetPlaybackSpeed(float f) {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.x(f);
            a2.a((pd8) null);
        }
    }

    public final void onSetRating(Rating rating) {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.y(dyb.a(rating));
            a2.a((pd8) null);
        }
    }

    public final void onSkipToNext() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.C();
            a2.a((pd8) null);
        }
    }

    public final void onSkipToPrevious() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.D();
            a2.a((pd8) null);
        }
    }

    public final void onSkipToQueueItem(long j) {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.E(j);
            a2.a((pd8) null);
        }
    }

    public final void onStop() {
        pc8 a2 = a();
        if (a2 != null) {
            this.a.F();
            a2.a((pd8) null);
        }
    }
}
