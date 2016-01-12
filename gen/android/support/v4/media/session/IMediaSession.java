/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\workspace\\android_support_v4\\src\\android\\support\\v4\\media\\session\\IMediaSession.aidl
 */
package android.support.v4.media.session;
/**
 * Interface to a MediaSessionCompat. This is only used on pre-Lollipop systems.
 * @hide
 */
public interface IMediaSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaSession
{
private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.support.v4.media.session.IMediaSession interface,
 * generating a proxy if needed.
 */
public static android.support.v4.media.session.IMediaSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.support.v4.media.session.IMediaSession))) {
return ((android.support.v4.media.session.IMediaSession)iin);
}
return new android.support.v4.media.session.IMediaSession.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_sendCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper _arg2;
if ((0!=data.readInt())) {
_arg2 = android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.sendCommand(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMediaButton:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.sendMediaButton(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerCallbackListener:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.IMediaControllerCallback _arg0;
_arg0 = android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallbackListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallbackListener:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.IMediaControllerCallback _arg0;
_arg0 = android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallbackListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isTransportControlEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTransportControlEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTag();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLaunchPendingIntent:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _result = this.getLaunchPendingIntent();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getFlags:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getFlags();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getVolumeAttributes:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.ParcelableVolumeInfo _result = this.getVolumeAttributes();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_adjustVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.adjustVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setVolumeTo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.setVolumeTo(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_play:
{
data.enforceInterface(DESCRIPTOR);
this.play();
reply.writeNoException();
return true;
}
case TRANSACTION_playFromMediaId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.playFromMediaId(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_playFromSearch:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.playFromSearch(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_skipToQueueItem:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.skipToQueueItem(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
this.pause();
reply.writeNoException();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_next:
{
data.enforceInterface(DESCRIPTOR);
this.next();
reply.writeNoException();
return true;
}
case TRANSACTION_previous:
{
data.enforceInterface(DESCRIPTOR);
this.previous();
reply.writeNoException();
return true;
}
case TRANSACTION_fastForward:
{
data.enforceInterface(DESCRIPTOR);
this.fastForward();
reply.writeNoException();
return true;
}
case TRANSACTION_rewind:
{
data.enforceInterface(DESCRIPTOR);
this.rewind();
reply.writeNoException();
return true;
}
case TRANSACTION_seekTo:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.seekTo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_rate:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.RatingCompat _arg0;
if ((0!=data.readInt())) {
_arg0 = android.support.v4.media.RatingCompat.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.rate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendCustomAction:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendCustomAction(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getMetadata:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.MediaMetadataCompat _result = this.getMetadata();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getPlaybackState:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.PlaybackStateCompat _result = this.getPlaybackState();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getQueue:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> _result = this.getQueue();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getQueueTitle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _result = this.getQueueTitle();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getExtras:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _result = this.getExtras();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getRatingType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRatingType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.support.v4.media.session.IMediaSession
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void sendCommand(java.lang.String command, android.os.Bundle args, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(command);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((cb!=null)) {
_data.writeInt(1);
cb.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendCommand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean sendMediaButton(android.view.KeyEvent mediaButton) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((mediaButton!=null)) {
_data.writeInt(1);
mediaButton.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendMediaButton, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallbackListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallbackListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isTransportControlEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTransportControlEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getTag() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTag, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.PendingIntent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLaunchPendingIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.PendingIntent.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getFlags() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFlags, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.support.v4.media.session.ParcelableVolumeInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVolumeAttributes, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void adjustVolume(int direction, int flags, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
_data.writeInt(flags);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_adjustVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setVolumeTo(int value, int flags, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(value);
_data.writeInt(flags);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_setVolumeTo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These commands are for the TransportControls

@Override public void play() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void playFromMediaId(java.lang.String uri, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uri);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_playFromMediaId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void playFromSearch(java.lang.String string, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(string);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_playFromSearch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void skipToQueueItem(long id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(id);
mRemote.transact(Stub.TRANSACTION_skipToQueueItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void previous() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_previous, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void fastForward() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_fastForward, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void rewind() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_rewind, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void seekTo(long pos) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(pos);
mRemote.transact(Stub.TRANSACTION_seekTo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void rate(android.support.v4.media.RatingCompat rating) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((rating!=null)) {
_data.writeInt(1);
rating.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_rate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendCustomAction(java.lang.String action, android.os.Bundle args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendCustomAction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.support.v4.media.MediaMetadataCompat _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMetadata, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.support.v4.media.MediaMetadataCompat.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.support.v4.media.session.PlaybackStateCompat _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPlaybackState, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.support.v4.media.session.PlaybackStateCompat.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueue, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueueTitle, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.Bundle getExtras() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getExtras, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRatingType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRatingType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_sendCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendMediaButton = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerCallbackListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterCallbackListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isTransportControlEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getLaunchPendingIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getFlags = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getVolumeAttributes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_adjustVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setVolumeTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_playFromMediaId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_playFromSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_skipToQueueItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_previous = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_fastForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_rewind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_seekTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_rate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_sendCustomAction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getMetadata = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getPlaybackState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getQueueTitle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getExtras = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getRatingType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
}
public void sendCommand(java.lang.String command, android.os.Bundle args, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper cb) throws android.os.RemoteException;
public boolean sendMediaButton(android.view.KeyEvent mediaButton) throws android.os.RemoteException;
public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback cb) throws android.os.RemoteException;
public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback cb) throws android.os.RemoteException;
public boolean isTransportControlEnabled() throws android.os.RemoteException;
public java.lang.String getPackageName() throws android.os.RemoteException;
public java.lang.String getTag() throws android.os.RemoteException;
public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;
public long getFlags() throws android.os.RemoteException;
public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException;
public void adjustVolume(int direction, int flags, java.lang.String packageName) throws android.os.RemoteException;
public void setVolumeTo(int value, int flags, java.lang.String packageName) throws android.os.RemoteException;
// These commands are for the TransportControls

public void play() throws android.os.RemoteException;
public void playFromMediaId(java.lang.String uri, android.os.Bundle extras) throws android.os.RemoteException;
public void playFromSearch(java.lang.String string, android.os.Bundle extras) throws android.os.RemoteException;
public void skipToQueueItem(long id) throws android.os.RemoteException;
public void pause() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void next() throws android.os.RemoteException;
public void previous() throws android.os.RemoteException;
public void fastForward() throws android.os.RemoteException;
public void rewind() throws android.os.RemoteException;
public void seekTo(long pos) throws android.os.RemoteException;
public void rate(android.support.v4.media.RatingCompat rating) throws android.os.RemoteException;
public void sendCustomAction(java.lang.String action, android.os.Bundle args) throws android.os.RemoteException;
public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException;
public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException;
public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException;
public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;
public android.os.Bundle getExtras() throws android.os.RemoteException;
public int getRatingType() throws android.os.RemoteException;
}
