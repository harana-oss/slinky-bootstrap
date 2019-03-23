package com.harana.slinky.bootstrap.date_picker

import com.harana.slinky.bootstrap.date_picker.Types.ChangeCallback
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{ExternalComponent, StatelessComponent}
import typings.reactLib.reactMod.ReactNs.FocusEventHandler

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap-date-picker", JSImport.Namespace)
@js.native
object ReactDatePicker extends js.Object

@react object DatePicker extends ExternalComponent {

  case class Props(autoFocus: Option[Boolean] = None,
                   calendarContainer: Option[js.Any] = None,
                   calendarPlacement: Option[String] = None,
                   cellPadding: Option[String] = None,
                   className: Option[String] = None,
                   clearButtonElement: Option[ReactElement] = None,
                   customControl: Option[StatelessComponent],
                   dateFormat: Option[String] = None,
                   dayLabels: Option[Seq[String]] = None,
                   defaultValue: Option[String] = None,
                   disabled: Option[Boolean] = None,
                   maxDate: Option[String] = None,
                   minDate: Option[String] = None,
                   monthLabels: Option[Seq[String]] = None,
                   nextButtonElement: Option[ReactElement] = None,
                   onBlur: Option[FocusEventHandler[_]] = None,
                   onChange: Option[ChangeCallback] = None,
                   onClear: Option[() => Unit] = None,
                   onFocus: Option[FocusEventHandler[_]] = None,
                   previousButtonElement: Option[ReactElement] = None,
                   showClearButton: Option[Boolean] = None,
                   showTodayButton: Option[Boolean] = None,
                   style: Option[js.Any] = None,
                   todayButtonLabel: Option[String] = None,
                   value: Option[String] = None,
                   weekStartsOnMonday: Option[Boolean] = None)

  override val component = ReactDatePicker
}

object Types {
  type ChangeCallback = js.Function2[String,String, Unit]
  type DatePicker =  js.Any
}