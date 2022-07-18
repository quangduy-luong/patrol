import 'package:example/main.dart';
import 'package:maestro_test/maestro_test.dart';

void main() {
  final maestro = Maestro.forTest();

  maestroTest(
    'counter state is the same after going to Home and switching apps',
    ($) async {
      await $.pumpWidgetAndSettle(MyApp());

      await maestro.openFullNotificationShade();
      await maestro.tap(Selector(text: 'Bluetooth'));
      await maestro.tap(Selector(text: 'Bluetooth'));
      await maestro.pressBack();

      await maestro.openHalfNotificationShade();

      await maestro.enableWifi();
      await maestro.disableWifi();
      await maestro.enableWifi();

      await maestro.enableCelluar();
      await maestro.disableCelluar();
      await maestro.enableCelluar();

      await maestro.enableDarkMode();
      await maestro.disableDarkMode();
      await maestro.enableDarkMode();

      await maestro.pressBack();
    },
    appName: 'ExampleApp',
  );
}