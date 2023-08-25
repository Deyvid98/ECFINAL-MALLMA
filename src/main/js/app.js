const React = require('react');
const ReactDOM = require('react-dom');
const {createBrowserRouter, RouterProvider} = require('react-router-dom');

const HomePage = require('./pages/home');
const NuevoMusicoPage = require('./pages/nuevo-musico');
const VerCursoPage = require('./pages/ver-curso');
const NuevoCursoPage = require('./pages/nuevo-curso');
const VerMusicoPage = require('./pages/ver-musico');

const router = createBrowserRouter([
	{ path: '/', element: <HomePage /> },
	{ path: '/ver-curso/:id', element: <VerCursoPage /> },
	{ path: '/nuevo-curso', element: <NuevoCursoPage /> },
	{ path: '/ver-musico/:id', element: <VerMusicoPage /> },
	{ path: '/nuevo-musico', element: <NuevoMusicoPage /> },
])


ReactDOM.render(
	<React.StrictMode>
		<RouterProvider router={router} />
	</React.StrictMode>,
	document.getElementById('react'))
