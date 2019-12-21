import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class AgpSettings extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-text-field label="Emailadresse der IT" placeholder="email@server.de" id="textFieldMailIT" style="width:50%;"></vaadin-text-field>
 <vaadin-text-field label="Betreff" placeholder="Placeholder" id="textFieldBetreffIT" style="width:50%;"></vaadin-text-field>
 <vaadin-text-area label="Bestellung eingegangen  E-Mail (an Herrn Schulte)" id="textAreaEingegangen" style="width:50%;"></vaadin-text-area>
 <vaadin-text-field label="Emailadresse der Buchhaltung" placeholder="email@server.de" id="textFieldMailFIBU" style="width:50%;"></vaadin-text-field>
 <vaadin-text-field label="Betreff" placeholder="Placeholder" id="textFieldBetreffFIBU" style="width:50%;"></vaadin-text-field>
 <vaadin-text-area label="E-Mail an Buchhaltung" id="textAreaBuchhaltung" style="width:50%;"></vaadin-text-area>
 <vaadin-text-field label="Betreff Abholbereit" placeholder="Ihre Bestellung ist abholbereit" id="textFieldBetreffAbhol" style="width:50%;"></vaadin-text-field>
 <vaadin-text-area label="Abholbereit E-Mail (an Kunde)" id="textAreaAbholen" style="width:50%;"></vaadin-text-area>
 <vaadin-text-field label="Betreff Kaufbestätigung" placeholder="Bestellbestätigung" id="textFieldBetreffKauf" style="width:50%;"></vaadin-text-field>
 <vaadin-text-area label="Kaufbestätigung E-Mail an Kunde" id="textAreaKunde" style="width:50%;"></vaadin-text-area>
 <vaadin-button theme="primary" id="buttonSpeichern" style="align-self: center;">
   Emaileinstellungen Speichern 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100px; align-items: flex-end;">
  <vaadin-combo-box id="comboBoxLoeschen" placeholder="Kategorie löschen"></vaadin-combo-box>
  <vaadin-button theme="primary" id="buttonLoeschen" content="" style="flex-grow: 0; width: 120px; flex-shrink: 0;" width="">
   Löschen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
  <vaadin-text-field label="" placeholder="Kategoriename" id="textFieldHinzufuegen"></vaadin-text-field>
  <vaadin-button theme="primary" id="buttonHinzufuegen" style="flex-grow: 0; width: 120px; flex-shrink: 0;">
   Hinzufügen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-combo-box id="comboBoxAdminDelete" placeholder="Admin löschen"></vaadin-combo-box>
  <vaadin-button theme="primary" id="buttonAdminDelete" style="flex-grow: 0; width: 120px; flex-shrink: 0;">
   Löschen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-text-field label="" placeholder="Admin Nutzername" id="textFieldAdminName"></vaadin-text-field>
  <vaadin-button theme="primary" id="buttonAdminAdd" style="flex-grow: 0; width: 120px; flex-shrink: 0;">
   Hinzufügen
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-settings';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpSettings.is, AgpSettings);
