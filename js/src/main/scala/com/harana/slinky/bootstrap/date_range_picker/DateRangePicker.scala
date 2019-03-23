package com.harana.slinky.bootstrap.date_range_picker

import com.harana.slinky.bootstrap.CSSProperties
import com.harana.slinky.bootstrap.date_range_picker.Types.EventHandler
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap-daterangepicker", JSImport.Namespace)
@js.native
object ReactDateRangePicker extends js.Object

@react object DateRangePicker extends ExternalComponent {

  case class Props(containerClass: Option[String] = None,
                   containerStyles: Option[CSSProperties] = None,
                   onApply: Option[EventHandler] = None,
                   onCancel: Option[EventHandler] = None,
                   onEvent: Option[EventHandler] = None,
                   onHide: Option[EventHandler] = None,
                   onHideCalendar: Option[EventHandler] = None,
                   onShow: Option[EventHandler] = None,
                   onShowCalendar: Option[EventHandler] = None)

  override val component = ReactDateRangePicker
}

object Types {
  type EventHandler = js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], js.Any]
}